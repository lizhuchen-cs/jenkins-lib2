def call(Map config =[:]){
    def script = libraryResource "docker/${config.name}"
    writeFile file: "${config.name}", text: script
    sh "chmod a+x ./${config.name}"
}