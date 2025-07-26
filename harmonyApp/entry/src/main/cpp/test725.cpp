
#include "test_0725.h"
#include "hilog/log.h"

#define LOG_TAG "MY_TAG"   // 全局tag宏，标识模块日志tag

int testNum(int num) {
    return num + 1;
}

void print_string(char* msg) {
    OH_LOG_INFO(LOG_APP, "KN: print_string: num=%{public}s", msg);
}
