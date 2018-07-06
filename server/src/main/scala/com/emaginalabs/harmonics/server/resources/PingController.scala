package com.emaginalabs.harmonics.server.resources

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class PingController extends Controller {

  get("/ping") { request: Request =>
    "pong"
  }
}
