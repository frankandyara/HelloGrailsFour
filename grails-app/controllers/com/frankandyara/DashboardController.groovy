package com.frankandyara

class DashboardController {

    def index() { 
        // Testing a quick render without view:
        // render 'Welcome to the Dashboard!'
    }

    def resty() {
        def buildings = ['CM':'22','BU':'80']
        respond buildings
    }
}
