# compojure-spike

A simple example of how one (myself) might get up and running w/
Compojure.

## Usage

Via emacs, start the dev server like so:

```clojure
(require 'compojure-spike.core/app)
(use 'ring.util.serve)

(serve compojure-spike.core/app)
```

To shut down:

```clojure
(stop-server)
```

## License

Copyright (C) 2012 Michael Gorsuch <michael.gorsuch@gmail.com>

Distributed under the Eclipse Public License, the same as Clojure.
