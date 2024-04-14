//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for TranscriptionSegment
void main() {
  // final instance = TranscriptionSegment();

  group('test TranscriptionSegment', () {
    // Unique identifier of the segment.
    // int id
    test('to test the property `id`', () async {
      // TODO
    });

    // Seek offset of the segment.
    // int seek
    test('to test the property `seek`', () async {
      // TODO
    });

    // Start time of the segment in seconds.
    // double start
    test('to test the property `start`', () async {
      // TODO
    });

    // End time of the segment in seconds.
    // double end
    test('to test the property `end`', () async {
      // TODO
    });

    // Text content of the segment.
    // String text
    test('to test the property `text`', () async {
      // TODO
    });

    // Array of token IDs for the text content.
    // List<int> tokens (default value: const [])
    test('to test the property `tokens`', () async {
      // TODO
    });

    // Temperature parameter used for generating the segment.
    // double temperature
    test('to test the property `temperature`', () async {
      // TODO
    });

    // Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
    // double avgLogprob
    test('to test the property `avgLogprob`', () async {
      // TODO
    });

    // Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
    // double compressionRatio
    test('to test the property `compressionRatio`', () async {
      // TODO
    });

    // Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
    // double noSpeechProb
    test('to test the property `noSpeechProb`', () async {
      // TODO
    });


  });

}
