# Tuples

A Tuples implementation in Kotlin.

### What are tuples?

A tuple is a finite, heterogeneous, ordered series of elements.

### Why does this project exist?

A few years ago, while learning Java/Android, I was introduced to the original [JavaTuples](https://www.javatuples.org)
library - a simple, elegant library for creating and working with tuples.

This project implements similar functionality in Kotlin, using Kotlin-esque semantics. Also, it more closely follows
ordinal (as opposed to index-based) semantics in certain circumstances, where it seems appropriate.

Some examples:

- `Element` class vs `Unit` class (to avoid confusion with `Unit` in Kotlin)
- `tripletOf(a, b, c)` vs `Triplet.with(a, b, c)`
- `myTuple.first` vs `myTuple.getValue0()`
- `myOtherTuple.dropSecond()` vs `myOtherTuple.removeFrom1()`

This project (like all of my personal projects, really) exists mainly to give me a playground in which to experiment.
Should you find it useful, [drop me a line](mailto:rooksoto@gmail.com). I'd be very happy to hear about how you use it!

### ToDo

- Finish this README.
- Add KDocs for each of the Tuple classes.
- Add homogenous Tuple implementation?
- Add `HenDecade` and `Dozen` classes?
- Rename `Ennead` to `Nonet`?

#### Made with ❤️ in Connecticut, USA by Rook Soto.