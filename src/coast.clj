(ns coast
  (:require [potemkin :refer [import-vars]]
            [hiccup2.core]
            [coast.db]
            [coast.theta]
            [coast.env]
            [coast.time]
            [coast.components]
            [coast.responses]
            [coast.utils]
            [coast.error]
            [coast.router]
            [coast.jobs]
            [coast.validation])
  (:refer-clojure :exclude [update]))

(import-vars
  [coast.responses
   ok
   bad-request
   not-found
   unauthorized
   server-error
   redirect
   flash]

  [coast.error
   raise
   rescue]

  [coast.db
   q
   pull
   transact
   delete
   insert
   update
   first!
   pluck
   fetch]

  [coast.validation
   validate]

  [coast.components
   csrf
   form
   js
   css]

  [coast.router
   routes
   wrap-routes
   prefix-routes]

  [coast.middleware
   wrap-with-layout
   wrap-layout
   site-routes
   api-routes]

  [coast.theta
   server
   app
   url-for
   action-for
   redirect-to
   form-for]

  [coast.env
   env]

  [coast.jobs
   queue]

  [coast.utils
   uuid]

  [coast.time
   now]

  [hiccup2.core
   raw
   html])
