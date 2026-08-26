//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateSpeechRequest {
  /// Returns a new [CreateSpeechRequest] instance.
  CreateSpeechRequest({
    required this.model,
    required this.input,
    required this.voice,
    this.responseFormat = const CreateSpeechRequestResponseFormatEnum._('mp3'),
    this.speed = 1,
  });

  CreateSpeechRequestModel model;

  /// The text to generate audio for. The maximum length is 4096 characters.
  String input;

  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  CreateSpeechRequestVoiceEnum voice;

  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  CreateSpeechRequestResponseFormatEnum responseFormat;

  /// The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
  ///
  /// Minimum value: 0.25
  /// Maximum value: 4
  num speed;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateSpeechRequest &&
    other.model == model &&
    other.input == input &&
    other.voice == voice &&
    other.responseFormat == responseFormat &&
    other.speed == speed;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (model.hashCode) +
    (input.hashCode) +
    (voice.hashCode) +
    (responseFormat.hashCode) +
    (speed.hashCode);

  @override
  String toString() => 'CreateSpeechRequest[model=$model, input=$input, voice=$voice, responseFormat=$responseFormat, speed=$speed]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'model'] = this.model;
      json[r'input'] = this.input;
      json[r'voice'] = this.voice;
      json[r'response_format'] = this.responseFormat;
      json[r'speed'] = this.speed;
    return json;
  }

  /// Returns a new [CreateSpeechRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateSpeechRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'model'), 'Required key "CreateSpeechRequest[model]" is missing from JSON.');
        assert(json[r'model'] != null, 'Required key "CreateSpeechRequest[model]" has a null value in JSON.');
        assert(json.containsKey(r'input'), 'Required key "CreateSpeechRequest[input]" is missing from JSON.');
        assert(json[r'input'] != null, 'Required key "CreateSpeechRequest[input]" has a null value in JSON.');
        assert(json.containsKey(r'voice'), 'Required key "CreateSpeechRequest[voice]" is missing from JSON.');
        assert(json[r'voice'] != null, 'Required key "CreateSpeechRequest[voice]" has a null value in JSON.');
        return true;
      }());

      return CreateSpeechRequest(
        model: CreateSpeechRequestModel.fromJson(json[r'model'])!,
        input: mapValueOfType<String>(json, r'input')!,
        voice: CreateSpeechRequestVoiceEnum.fromJson(json[r'voice'])!,
        responseFormat: CreateSpeechRequestResponseFormatEnum.fromJson(json[r'response_format']) ?? const CreateSpeechRequestResponseFormatEnum._('mp3'),
        speed: num.parse('${json[r'speed']}'),
      );
    }
    return null;
  }

  static List<CreateSpeechRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateSpeechRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateSpeechRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateSpeechRequest> mapFromJson(dynamic json) {
    final map = <String, CreateSpeechRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateSpeechRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateSpeechRequest-objects as value to a dart map
  static Map<String, List<CreateSpeechRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateSpeechRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateSpeechRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'model',
    'input',
    'voice',
  };
}

/// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
enum CreateSpeechRequestVoiceEnum {
  alloy._(r'alloy'),
  echo._(r'echo'),
  fable._(r'fable'),
  onyx._(r'onyx'),
  nova._(r'nova'),
  shimmer._(r'shimmer'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateSpeechRequestVoiceEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateSpeechRequestVoiceEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateSpeechRequestVoiceEnum? fromJson(dynamic value) => CreateSpeechRequestVoiceEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateSpeechRequestVoiceEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateSpeechRequestVoiceEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateSpeechRequestVoiceEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateSpeechRequestVoiceEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateSpeechRequestVoiceEnum] to String,
/// and [decode] dynamic data back to [CreateSpeechRequestVoiceEnum].
class CreateSpeechRequestVoiceEnumTypeTransformer {
  factory CreateSpeechRequestVoiceEnumTypeTransformer() => _instance ??= const CreateSpeechRequestVoiceEnumTypeTransformer._();

  const CreateSpeechRequestVoiceEnumTypeTransformer._();

  String encode(CreateSpeechRequestVoiceEnum data) => data._value;

  /// Returns the instance of [CreateSpeechRequestVoiceEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateSpeechRequestVoiceEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateSpeechRequestVoiceEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'alloy': return CreateSpeechRequestVoiceEnum.alloy;
        case r'echo': return CreateSpeechRequestVoiceEnum.echo;
        case r'fable': return CreateSpeechRequestVoiceEnum.fable;
        case r'onyx': return CreateSpeechRequestVoiceEnum.onyx;
        case r'nova': return CreateSpeechRequestVoiceEnum.nova;
        case r'shimmer': return CreateSpeechRequestVoiceEnum.shimmer;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateSpeechRequestVoiceEnumTypeTransformer? _instance;
}


/// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
enum CreateSpeechRequestResponseFormatEnum {
  mp3._(r'mp3'),
  opus._(r'opus'),
  aac._(r'aac'),
  flac._(r'flac'),
  wav._(r'wav'),
  pcm._(r'pcm'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateSpeechRequestResponseFormatEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateSpeechRequestResponseFormatEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateSpeechRequestResponseFormatEnum? fromJson(dynamic value) => CreateSpeechRequestResponseFormatEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateSpeechRequestResponseFormatEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateSpeechRequestResponseFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateSpeechRequestResponseFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateSpeechRequestResponseFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateSpeechRequestResponseFormatEnum] to String,
/// and [decode] dynamic data back to [CreateSpeechRequestResponseFormatEnum].
class CreateSpeechRequestResponseFormatEnumTypeTransformer {
  factory CreateSpeechRequestResponseFormatEnumTypeTransformer() => _instance ??= const CreateSpeechRequestResponseFormatEnumTypeTransformer._();

  const CreateSpeechRequestResponseFormatEnumTypeTransformer._();

  String encode(CreateSpeechRequestResponseFormatEnum data) => data._value;

  /// Returns the instance of [CreateSpeechRequestResponseFormatEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateSpeechRequestResponseFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateSpeechRequestResponseFormatEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'mp3': return CreateSpeechRequestResponseFormatEnum.mp3;
        case r'opus': return CreateSpeechRequestResponseFormatEnum.opus;
        case r'aac': return CreateSpeechRequestResponseFormatEnum.aac;
        case r'flac': return CreateSpeechRequestResponseFormatEnum.flac;
        case r'wav': return CreateSpeechRequestResponseFormatEnum.wav;
        case r'pcm': return CreateSpeechRequestResponseFormatEnum.pcm;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateSpeechRequestResponseFormatEnumTypeTransformer? _instance;
}


