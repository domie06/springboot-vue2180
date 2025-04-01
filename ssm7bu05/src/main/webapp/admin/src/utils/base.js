const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm7bu05/",
            name: "ssm7bu05",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7bu05/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "斗车交易系统"
        } 
    }
}
export default base
