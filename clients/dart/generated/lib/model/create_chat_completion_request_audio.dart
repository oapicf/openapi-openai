//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatCompletionRequestAudio {
  /// Returns a new [CreateChatCompletionRequestAudio] instance.
  CreateChatCompletionRequestAudio({
    required this.voice,
    required this.format,
  });

  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  CreateChatCompletionRequestAudioVoiceEnum voice;

  /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  CreateChatCompletionRequestAudioFormatEnum format;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatCompletionRequestAudio &&
    other.voice == voice &&
    other.format == format;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (voice.hashCode) +
    (format.hashCode);

  @override
  String toString() => 'CreateChatCompletionRequestAudio[voice=$voice, format=$format]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'voice'] = this.voice;
      json[r'format'] = this.format;
    return json;
  }

  /// Returns a new [CreateChatCompletionRequestAudio] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatCompletionRequestAudio? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'voice'), 'Required key "CreateChatCompletionRequestAudio[voice]" is missing from JSON.');
        assert(json[r'voice'] != null, 'Required key "CreateChatCompletionRequestAudio[voice]" has a null value in JSON.');
        assert(json.containsKey(r'format'), 'Required key "CreateChatCompletionRequestAudio[format]" is missing from JSON.');
        assert(json[r'format'] != null, 'Required key "CreateChatCompletionRequestAudio[format]" has a null value in JSON.');
        return true;
      }());

      return CreateChatCompletionRequestAudio(
        voice: CreateChatCompletionRequestAudioVoiceEnum.fromJson(json[r'voice'])!,
        format: CreateChatCompletionRequestAudioFormatEnum.fromJson(json[r'format'])!,
      );
    }
    return null;
  }

  static List<CreateChatCompletionRequestAudio> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionRequestAudio>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionRequestAudio.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatCompletionRequestAudio> mapFromJson(dynamic json) {
    final map = <String, CreateChatCompletionRequestAudio>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatCompletionRequestAudio.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatCompletionRequestAudio-objects as value to a dart map
  static Map<String, List<CreateChatCompletionRequestAudio>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatCompletionRequestAudio>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatCompletionRequestAudio.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'voice',
    'format',
  };
}

/// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
enum CreateChatCompletionRequestAudioVoiceEnum {
  alloy._(r'alloy'),
  ash._(r'ash'),
  ballad._(r'ballad'),
  coral._(r'coral'),
  echo._(r'echo'),
  sage._(r'sage'),
  shimmer._(r'shimmer'),
  verse._(r'verse'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateChatCompletionRequestAudioVoiceEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateChatCompletionRequestAudioVoiceEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateChatCompletionRequestAudioVoiceEnum? fromJson(dynamic value) => CreateChatCompletionRequestAudioVoiceEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateChatCompletionRequestAudioVoiceEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateChatCompletionRequestAudioVoiceEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionRequestAudioVoiceEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionRequestAudioVoiceEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionRequestAudioVoiceEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionRequestAudioVoiceEnum].
class CreateChatCompletionRequestAudioVoiceEnumTypeTransformer {
  factory CreateChatCompletionRequestAudioVoiceEnumTypeTransformer() => _instance ??= const CreateChatCompletionRequestAudioVoiceEnumTypeTransformer._();

  const CreateChatCompletionRequestAudioVoiceEnumTypeTransformer._();

  String encode(CreateChatCompletionRequestAudioVoiceEnum data) => data._value;

  /// Returns the instance of [CreateChatCompletionRequestAudioVoiceEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionRequestAudioVoiceEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateChatCompletionRequestAudioVoiceEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'alloy': return CreateChatCompletionRequestAudioVoiceEnum.alloy;
        case r'ash': return CreateChatCompletionRequestAudioVoiceEnum.ash;
        case r'ballad': return CreateChatCompletionRequestAudioVoiceEnum.ballad;
        case r'coral': return CreateChatCompletionRequestAudioVoiceEnum.coral;
        case r'echo': return CreateChatCompletionRequestAudioVoiceEnum.echo;
        case r'sage': return CreateChatCompletionRequestAudioVoiceEnum.sage;
        case r'shimmer': return CreateChatCompletionRequestAudioVoiceEnum.shimmer;
        case r'verse': return CreateChatCompletionRequestAudioVoiceEnum.verse;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateChatCompletionRequestAudioVoiceEnumTypeTransformer? _instance;
}


/// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
enum CreateChatCompletionRequestAudioFormatEnum {
  wav._(r'wav'),
  mp3._(r'mp3'),
  flac._(r'flac'),
  opus._(r'opus'),
  pcm16._(r'pcm16'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateChatCompletionRequestAudioFormatEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateChatCompletionRequestAudioFormatEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateChatCompletionRequestAudioFormatEnum? fromJson(dynamic value) => CreateChatCompletionRequestAudioFormatEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateChatCompletionRequestAudioFormatEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateChatCompletionRequestAudioFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionRequestAudioFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionRequestAudioFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionRequestAudioFormatEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionRequestAudioFormatEnum].
class CreateChatCompletionRequestAudioFormatEnumTypeTransformer {
  factory CreateChatCompletionRequestAudioFormatEnumTypeTransformer() => _instance ??= const CreateChatCompletionRequestAudioFormatEnumTypeTransformer._();

  const CreateChatCompletionRequestAudioFormatEnumTypeTransformer._();

  String encode(CreateChatCompletionRequestAudioFormatEnum data) => data._value;

  /// Returns the instance of [CreateChatCompletionRequestAudioFormatEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionRequestAudioFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateChatCompletionRequestAudioFormatEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'wav': return CreateChatCompletionRequestAudioFormatEnum.wav;
        case r'mp3': return CreateChatCompletionRequestAudioFormatEnum.mp3;
        case r'flac': return CreateChatCompletionRequestAudioFormatEnum.flac;
        case r'opus': return CreateChatCompletionRequestAudioFormatEnum.opus;
        case r'pcm16': return CreateChatCompletionRequestAudioFormatEnum.pcm16;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateChatCompletionRequestAudioFormatEnumTypeTransformer? _instance;
}


