def call(Map config =[:]){
    load1(name: "test.sh")
    sh "./test.sh ${config.name}"
}