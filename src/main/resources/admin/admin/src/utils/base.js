const base = {
    get() {
        return {
            url : "http://localhost:8080/springboota1ly5177/",
            name: "springboota1ly5177",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboota1ly5177/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Springboot的废品回收系统的设计与实现"
        } 
    }
}
export default base
