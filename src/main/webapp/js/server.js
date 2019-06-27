//调用mock方法模拟数据
Mock.mock(
    'login.do', {
        "userName" : '@name',     //模拟名称
        "age|1-100":100,          //模拟年龄(1-100)
        "color"    : "@color",    //模拟色值
        "date"     : "@date('yyyy-MM-dd')",  //模拟时间
        "url"      : "@url()",     //模拟url
        "content"  : "@cparagraph()" //模拟文本
    }
);
Mock.mock(
'test/t1', {
        "id" : 123,     //模拟名称
        "carcard":"川A12345",          //模拟年龄(1-100)
        "color"    : "@color",    //模拟色值
        "start"     : "@date('yyyy-MM-dd')",  //模拟时间
        "end"      : "@date('yyyy-MM-dd')",     //模拟url
        "cost"  : 23, //模拟文本
            "title":"标题",
            "time":"时间",
            "txt":"文本内容"
}
)