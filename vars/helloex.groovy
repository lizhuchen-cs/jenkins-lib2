def call(Map config =[:]){
    load(name: "test.sh")
    sh "./test.sh ${config.name}"
}