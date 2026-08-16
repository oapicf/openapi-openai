//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateTranscriptionResponseVerboseJson {
  /// Returns a new [CreateTranscriptionResponseVerboseJson] instance.
  CreateTranscriptionResponseVerboseJson({
    required this.language,
    required this.duration,
    required this.text,
    this.words = const [],
    this.segments = const [],
  });

  /// The language of the input audio.
  String language;

  /// The duration of the input audio.
  String duration;

  /// The transcribed text.
  String text;

  /// Extracted words and their corresponding timestamps.
  List<TranscriptionWord> words;

  /// Segments of the transcribed text and their corresponding details.
  List<TranscriptionSegment> segments;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateTranscriptionResponseVerboseJson &&
    other.language == language &&
    other.duration == duration &&
    other.text == text &&
    _deepEquality.equals(other.words, words) &&
    _deepEquality.equals(other.segments, segments);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (language.hashCode) +
    (duration.hashCode) +
    (text.hashCode) +
    (words.hashCode) +
    (segments.hashCode);

  @override
  String toString() => 'CreateTranscriptionResponseVerboseJson[language=$language, duration=$duration, text=$text, words=$words, segments=$segments]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'language'] = this.language;
      json[r'duration'] = this.duration;
      json[r'text'] = this.text;
      json[r'words'] = this.words;
      json[r'segments'] = this.segments;
    return json;
  }

  /// Returns a new [CreateTranscriptionResponseVerboseJson] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateTranscriptionResponseVerboseJson? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateTranscriptionResponseVerboseJson[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateTranscriptionResponseVerboseJson[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateTranscriptionResponseVerboseJson(
        language: mapValueOfType<String>(json, r'language')!,
        duration: mapValueOfType<String>(json, r'duration')!,
        text: mapValueOfType<String>(json, r'text')!,
        words: TranscriptionWord.listFromJson(json[r'words']),
        segments: TranscriptionSegment.listFromJson(json[r'segments']),
      );
    }
    return null;
  }

  static List<CreateTranscriptionResponseVerboseJson> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateTranscriptionResponseVerboseJson>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateTranscriptionResponseVerboseJson.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateTranscriptionResponseVerboseJson> mapFromJson(dynamic json) {
    final map = <String, CreateTranscriptionResponseVerboseJson>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateTranscriptionResponseVerboseJson.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateTranscriptionResponseVerboseJson-objects as value to a dart map
  static Map<String, List<CreateTranscriptionResponseVerboseJson>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateTranscriptionResponseVerboseJson>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateTranscriptionResponseVerboseJson.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'language',
    'duration',
    'text',
  };
}

