package app

import grails.util.BuildSettings

class BootStrap {

    def init = { servletContext ->
        assert BuildSettings.TARGET_DIR.absolutePath == BuildSettings.BASE_DIR.absolutePath + "/build"
    }
    def destroy = {
    }
}
