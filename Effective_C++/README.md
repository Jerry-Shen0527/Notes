# Notes

### C++ is a federation of languages.

- C
- OOP
- Template
- STL

### 使用 const, enum, inline, 而不是define

#### const

好处：

- 便于追踪错误信息
- 保持数据的类型(float, double)
- class专属常量可以有作用域

注意：

- const 指针的使用
- class专属常量：使用static const，使只有一份实例。此时只做了声明，需要在实现文件中提供定义式。(特例的特例：内置类型如果不取地址也可以不进行定义)

#### enum hack

枚举类型的数值可以当作int来使用，而且是模板元编程的基础技术

#### 使用inline来替代宏

宏的语义展开可能出现各种问题

### 尽可能使用const

*提供更多信息，帮助编译器和其他程序员*

使用方法我比较熟悉了。

注意：

- 指向常量的指针对应STL中的迭代器为 const_iterator
- return 一个对象的拷贝时避免重赋值

#### const成员函数

- 指明该成员函数可以用于const对象
- 可以“操作 const”对象：常量性不同可以帮助重载，而bitwise const就有可能通过返回非const的引用被打破
- logical constness ：允许进行一些客户端侦测不到的改动，mutable关键字来进行 const 释放，编程设计时应该考虑的常量性
- 避免重复：static_cast用来移除const，const_cast用来加上const，通常只能使用non-const版本调用const版本

### 确保对象使用前被初始化

*类似C的代码不保证被初始化，而STL的容器会被初始化。解决方案是总是手动初始化。*

初始化应该写在构造函数之前，使用括号进行。只调用一次拷贝构造函数更加高效。

自定义类型会调用默认构造函数。

const和reference只能通过括号进行初始化而不能通过赋值实现。

可以将初始化操作集中到init()中进行实现，psuedo-initialization。

初始化次序：

1. 基类比派生类先初始化
2. 成员变量以声明次序初始化，和成员初值链无关

#### 多个编译单元问题

注意：non-local static对象 (全局变量，namespace中的变量，class内的static，file作用域内的static)在main函数执行完成后被销毁

编译单元：生成单一目标文件的源码。一个源码+头文件。

没有办法确定编译顺序。比如：多个non-local static对象都由模板隐式实例化形成，无法决定正确的初始化次序。

解决方法：将non-local static对象挪到自己的专属函数，函数返回对象，用户不直接指涉对象。Singleton的常见实现手法。C++保证，local static对象会在首次遇到定义式时初始化。

线程不安全。可以在单线程启动阶段各调用所有的专属函数。

