# Effective modern C++

### 模板和auto的型别推导

需要分成3种情况来考虑：

- #### 形参具有指针或者引用型别

  1. 如果是引用则先忽略引用，不忽略const
  2. 将expr的型别与之相匹配 

  形参如果是const形参则一律const

- #### 形参是一个万能引用

- #### 形参既不是指针也不是引用

  1. 忽略引用
  2. 忽略const和volatile

### 

### 移动语义和完美转发

形参始终是左值。

#### std::move和std::forward

 

### 智能指针

unique_ptr基本上都能干