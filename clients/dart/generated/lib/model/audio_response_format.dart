//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
enum AudioResponseFormat {
  json._(r'json'),
  text._(r'text'),
  srt._(r'srt'),
  verboseJson._(r'verbose_json'),
  vtt._(r'vtt'),
  ;

  /// Instantiate a new enum with the provided value.
  const AudioResponseFormat._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AudioResponseFormat] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AudioResponseFormat? fromJson(dynamic value) => AudioResponseFormatTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AudioResponseFormat]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AudioResponseFormat> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudioResponseFormat>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudioResponseFormat.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudioResponseFormat] to String,
/// and [decode] dynamic data back to [AudioResponseFormat].
class AudioResponseFormatTypeTransformer {
  factory AudioResponseFormatTypeTransformer() => _instance ??= const AudioResponseFormatTypeTransformer._();

  const AudioResponseFormatTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AudioResponseFormat data) => data._value;

  /// Returns the instance of [AudioResponseFormat] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudioResponseFormat? decode(dynamic data, {bool allowNull = true}) {
    if (data is AudioResponseFormat) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'json': return AudioResponseFormat.json;
        case r'text': return AudioResponseFormat.text;
        case r'srt': return AudioResponseFormat.srt;
        case r'verbose_json': return AudioResponseFormat.verboseJson;
        case r'vtt': return AudioResponseFormat.vtt;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AudioResponseFormatTypeTransformer? _instance;
}

