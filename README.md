# dropship

A Leiningen template for building microservices. Does the basic set up and wiring so you can get on with throwing JSON around.

Currently very WIP.

##Currently included

###The Stack

- http-kit
- ring
- ring/ring-json
- scenic
- cheshire

###Testing

- midje
- ring-mock
- lein-midje (plugin)

## Usage

```bash
lein new dropship my-awesome-service
cd my-awesome-service
lein midje
```

## License

Copyright © 2015 Gareth Rogers

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
