cmake_minimum_required(VERSION 3.14 FATAL_ERROR)

project(Template VERSION 0.0.3)
message(STATUS "[Project] ${PROJECT_NAME}")

include(cmake/InitUCMake.cmake)
Ubpa_InitUCMake()

Ubpa_InitProject()
include_directories(${PROJECT_SOURCE_DIR}/include)

Ubpa_AddSubDirsRec(include)
Ubpa_AddSubDirsRec(src)

