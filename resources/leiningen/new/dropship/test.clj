(ns {{sanitized}}.core-test
  (:require [midje.sweet :refer :all]
            [{{sanitized}}.core :refer [handler]]
            [ring.mock.request :refer [request]]))

(facts "Can get the status of the service"
      (fact "The service is alive when running"
            (handler (request :get "/status")) => contains {:status 200}))

