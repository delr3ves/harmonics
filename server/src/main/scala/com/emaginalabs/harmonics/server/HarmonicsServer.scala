package com.emaginalabs.harmonics.server

import com.emaginalabs.harmonics.server.resources.PingController
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter

object HarmonicsServerMain extends HarmonicsServer

class HarmonicsServer extends HttpServer {
  override protected def configureHttp(router: HttpRouter): Unit =
    router.add[PingController]
}
