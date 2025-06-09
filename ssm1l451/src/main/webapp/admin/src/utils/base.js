const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1l451/",
            name: "ssm1l451",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1l451/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人网站"
        } 
    }
}
export default base
