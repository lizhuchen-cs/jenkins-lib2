def call(Map config =[:]){
    load(name: "test1.sh")
    sh "./test.sh ${config.name}"
}