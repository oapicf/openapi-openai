//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TranscriptionSegment {
  /// Returns a new [TranscriptionSegment] instance.
  TranscriptionSegment({
    required this.id,
    required this.seek,
    required this.start,
    required this.end,
    required this.text,
    this.tokens = const [],
    required this.temperature,
    required this.avgLogprob,
    required this.compressionRatio,
    required this.noSpeechProb,
  });

  /// Unique identifier of the segment.
  int id;

  /// Seek offset of the segment.
  int seek;

  /// Start time of the segment in seconds.
  double start;

  /// End time of the segment in seconds.
  double end;

  /// Text content of the segment.
  String text;

  /// Array of token IDs for the text content.
  List<int> tokens;

  /// Temperature parameter used for generating the segment.
  double temperature;

  /// Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
  double avgLogprob;

  /// Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
  double compressionRatio;

  /// Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
  double noSpeechProb;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TranscriptionSegment &&
    other.id == id &&
    other.seek == seek &&
    other.start == start &&
    other.end == end &&
    other.text == text &&
    _deepEquality.equals(other.tokens, tokens) &&
    other.temperature == temperature &&
    other.avgLogprob == avgLogprob &&
    other.compressionRatio == compressionRatio &&
    other.noSpeechProb == noSpeechProb;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (seek.hashCode) +
    (start.hashCode) +
    (end.hashCode) +
    (text.hashCode) +
    (tokens.hashCode) +
    (temperature.hashCode) +
    (avgLogprob.hashCode) +
    (compressionRatio.hashCode) +
    (noSpeechProb.hashCode);

  @override
  String toString() => 'TranscriptionSegment[id=$id, seek=$seek, start=$start, end=$end, text=$text, tokens=$tokens, temperature=$temperature, avgLogprob=$avgLogprob, compressionRatio=$compressionRatio, noSpeechProb=$noSpeechProb]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'seek'] = this.seek;
      json[r'start'] = this.start;
      json[r'end'] = this.end;
      json[r'text'] = this.text;
      json[r'tokens'] = this.tokens;
      json[r'temperature'] = this.temperature;
      json[r'avg_logprob'] = this.avgLogprob;
      json[r'compression_ratio'] = this.compressionRatio;
      json[r'no_speech_prob'] = this.noSpeechProb;
    return json;
  }

  /// Returns a new [TranscriptionSegment] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TranscriptionSegment? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TranscriptionSegment[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TranscriptionSegment[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TranscriptionSegment(
        id: mapValueOfType<int>(json, r'id')!,
        seek: mapValueOfType<int>(json, r'seek')!,
        start: mapValueOfType<double>(json, r'start')!,
        end: mapValueOfType<double>(json, r'end')!,
        text: mapValueOfType<String>(json, r'text')!,
        tokens: json[r'tokens'] is Iterable
            ? (json[r'tokens'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        temperature: mapValueOfType<double>(json, r'temperature')!,
        avgLogprob: mapValueOfType<double>(json, r'avg_logprob')!,
        compressionRatio: mapValueOfType<double>(json, r'compression_ratio')!,
        noSpeechProb: mapValueOfType<double>(json, r'no_speech_prob')!,
      );
    }
    return null;
  }

  static List<TranscriptionSegment> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TranscriptionSegment>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TranscriptionSegment.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TranscriptionSegment> mapFromJson(dynamic json) {
    final map = <String, TranscriptionSegment>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TranscriptionSegment.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TranscriptionSegment-objects as value to a dart map
  static Map<String, List<TranscriptionSegment>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TranscriptionSegment>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TranscriptionSegment.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'seek',
    'start',
    'end',
    'text',
    'tokens',
    'temperature',
    'avg_logprob',
    'compression_ratio',
    'no_speech_prob',
  };
}

