//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeSessionCreateRequest {
  /// Returns a new [RealtimeSessionCreateRequest] instance.
  RealtimeSessionCreateRequest({
    this.modalities = const [],
    required this.model,
    this.instructions,
    this.voice,
    this.inputAudioFormat,
    this.outputAudioFormat,
    this.inputAudioTranscription,
    this.turnDetection,
    this.tools = const [],
    this.toolChoice,
    this.temperature,
    this.maxResponseOutputTokens,
  });

  /// The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  List<RealtimeSessionCreateRequestModalitiesEnum> modalities;

  /// The Realtime model used for this session. 
  RealtimeSessionCreateRequestModelEnum model;

  /// The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? instructions;

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  RealtimeSessionCreateRequestVoiceEnum? voice;

  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  RealtimeSessionCreateRequestInputAudioFormatEnum? inputAudioFormat;

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  RealtimeSessionCreateRequestOutputAudioFormatEnum? outputAudioFormat;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeSessionInputAudioTranscription? inputAudioTranscription;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeSessionCreateRequestTurnDetection? turnDetection;

  /// Tools (functions) available to the model.
  List<RealtimeResponseCreateParamsToolsInner> tools;

  /// How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? toolChoice;

  /// Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? temperature;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeResponseCreateParamsMaxResponseOutputTokens? maxResponseOutputTokens;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeSessionCreateRequest &&
    _deepEquality.equals(other.modalities, modalities) &&
    other.model == model &&
    other.instructions == instructions &&
    other.voice == voice &&
    other.inputAudioFormat == inputAudioFormat &&
    other.outputAudioFormat == outputAudioFormat &&
    other.inputAudioTranscription == inputAudioTranscription &&
    other.turnDetection == turnDetection &&
    _deepEquality.equals(other.tools, tools) &&
    other.toolChoice == toolChoice &&
    other.temperature == temperature &&
    other.maxResponseOutputTokens == maxResponseOutputTokens;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (modalities.hashCode) +
    (model.hashCode) +
    (instructions == null ? 0 : instructions!.hashCode) +
    (voice == null ? 0 : voice!.hashCode) +
    (inputAudioFormat == null ? 0 : inputAudioFormat!.hashCode) +
    (outputAudioFormat == null ? 0 : outputAudioFormat!.hashCode) +
    (inputAudioTranscription == null ? 0 : inputAudioTranscription!.hashCode) +
    (turnDetection == null ? 0 : turnDetection!.hashCode) +
    (tools.hashCode) +
    (toolChoice == null ? 0 : toolChoice!.hashCode) +
    (temperature == null ? 0 : temperature!.hashCode) +
    (maxResponseOutputTokens == null ? 0 : maxResponseOutputTokens!.hashCode);

  @override
  String toString() => 'RealtimeSessionCreateRequest[modalities=$modalities, model=$model, instructions=$instructions, voice=$voice, inputAudioFormat=$inputAudioFormat, outputAudioFormat=$outputAudioFormat, inputAudioTranscription=$inputAudioTranscription, turnDetection=$turnDetection, tools=$tools, toolChoice=$toolChoice, temperature=$temperature, maxResponseOutputTokens=$maxResponseOutputTokens]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'modalities'] = this.modalities;
      json[r'model'] = this.model;
    if (this.instructions != null) {
      json[r'instructions'] = this.instructions;
    } else {
      json[r'instructions'] = null;
    }
    if (this.voice != null) {
      json[r'voice'] = this.voice;
    } else {
      json[r'voice'] = null;
    }
    if (this.inputAudioFormat != null) {
      json[r'input_audio_format'] = this.inputAudioFormat;
    } else {
      json[r'input_audio_format'] = null;
    }
    if (this.outputAudioFormat != null) {
      json[r'output_audio_format'] = this.outputAudioFormat;
    } else {
      json[r'output_audio_format'] = null;
    }
    if (this.inputAudioTranscription != null) {
      json[r'input_audio_transcription'] = this.inputAudioTranscription;
    } else {
      json[r'input_audio_transcription'] = null;
    }
    if (this.turnDetection != null) {
      json[r'turn_detection'] = this.turnDetection;
    } else {
      json[r'turn_detection'] = null;
    }
      json[r'tools'] = this.tools;
    if (this.toolChoice != null) {
      json[r'tool_choice'] = this.toolChoice;
    } else {
      json[r'tool_choice'] = null;
    }
    if (this.temperature != null) {
      json[r'temperature'] = this.temperature;
    } else {
      json[r'temperature'] = null;
    }
    if (this.maxResponseOutputTokens != null) {
      json[r'max_response_output_tokens'] = this.maxResponseOutputTokens;
    } else {
      json[r'max_response_output_tokens'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeSessionCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeSessionCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'model'), 'Required key "RealtimeSessionCreateRequest[model]" is missing from JSON.');
        assert(json[r'model'] != null, 'Required key "RealtimeSessionCreateRequest[model]" has a null value in JSON.');
        return true;
      }());

      return RealtimeSessionCreateRequest(
        modalities: RealtimeSessionCreateRequestModalitiesEnum.listFromJson(json[r'modalities']),
        model: RealtimeSessionCreateRequestModelEnum.fromJson(json[r'model'])!,
        instructions: mapValueOfType<String>(json, r'instructions'),
        voice: RealtimeSessionCreateRequestVoiceEnum.fromJson(json[r'voice']),
        inputAudioFormat: RealtimeSessionCreateRequestInputAudioFormatEnum.fromJson(json[r'input_audio_format']),
        outputAudioFormat: RealtimeSessionCreateRequestOutputAudioFormatEnum.fromJson(json[r'output_audio_format']),
        inputAudioTranscription: RealtimeSessionInputAudioTranscription.fromJson(json[r'input_audio_transcription']),
        turnDetection: RealtimeSessionCreateRequestTurnDetection.fromJson(json[r'turn_detection']),
        tools: RealtimeResponseCreateParamsToolsInner.listFromJson(json[r'tools']),
        toolChoice: mapValueOfType<String>(json, r'tool_choice'),
        temperature: num.parse('${json[r'temperature']}'),
        maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens.fromJson(json[r'max_response_output_tokens']),
      );
    }
    return null;
  }

  static List<RealtimeSessionCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeSessionCreateRequest> mapFromJson(dynamic json) {
    final map = <String, RealtimeSessionCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeSessionCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeSessionCreateRequest-objects as value to a dart map
  static Map<String, List<RealtimeSessionCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeSessionCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeSessionCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'model',
  };
}


enum RealtimeSessionCreateRequestModalitiesEnum {
  text._(r'text'),
  audio._(r'audio'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeSessionCreateRequestModalitiesEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeSessionCreateRequestModalitiesEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeSessionCreateRequestModalitiesEnum? fromJson(dynamic value) => RealtimeSessionCreateRequestModalitiesEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeSessionCreateRequestModalitiesEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeSessionCreateRequestModalitiesEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionCreateRequestModalitiesEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionCreateRequestModalitiesEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionCreateRequestModalitiesEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionCreateRequestModalitiesEnum].
class RealtimeSessionCreateRequestModalitiesEnumTypeTransformer {
  factory RealtimeSessionCreateRequestModalitiesEnumTypeTransformer() => _instance ??= const RealtimeSessionCreateRequestModalitiesEnumTypeTransformer._();

  const RealtimeSessionCreateRequestModalitiesEnumTypeTransformer._();

  String encode(RealtimeSessionCreateRequestModalitiesEnum data) => data._value;

  /// Returns the instance of [RealtimeSessionCreateRequestModalitiesEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionCreateRequestModalitiesEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeSessionCreateRequestModalitiesEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'text': return RealtimeSessionCreateRequestModalitiesEnum.text;
        case r'audio': return RealtimeSessionCreateRequestModalitiesEnum.audio;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeSessionCreateRequestModalitiesEnumTypeTransformer? _instance;
}


/// The Realtime model used for this session. 
enum RealtimeSessionCreateRequestModelEnum {
  gpt4oRealtimePreview._(r'gpt-4o-realtime-preview'),
  gpt4oRealtimePreview20241001._(r'gpt-4o-realtime-preview-2024-10-01'),
  gpt4oRealtimePreview20241217._(r'gpt-4o-realtime-preview-2024-12-17'),
  gpt4oMiniRealtimePreview._(r'gpt-4o-mini-realtime-preview'),
  gpt4oMiniRealtimePreview20241217._(r'gpt-4o-mini-realtime-preview-2024-12-17'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeSessionCreateRequestModelEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeSessionCreateRequestModelEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeSessionCreateRequestModelEnum? fromJson(dynamic value) => RealtimeSessionCreateRequestModelEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeSessionCreateRequestModelEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeSessionCreateRequestModelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionCreateRequestModelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionCreateRequestModelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionCreateRequestModelEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionCreateRequestModelEnum].
class RealtimeSessionCreateRequestModelEnumTypeTransformer {
  factory RealtimeSessionCreateRequestModelEnumTypeTransformer() => _instance ??= const RealtimeSessionCreateRequestModelEnumTypeTransformer._();

  const RealtimeSessionCreateRequestModelEnumTypeTransformer._();

  String encode(RealtimeSessionCreateRequestModelEnum data) => data._value;

  /// Returns the instance of [RealtimeSessionCreateRequestModelEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionCreateRequestModelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeSessionCreateRequestModelEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'gpt-4o-realtime-preview': return RealtimeSessionCreateRequestModelEnum.gpt4oRealtimePreview;
        case r'gpt-4o-realtime-preview-2024-10-01': return RealtimeSessionCreateRequestModelEnum.gpt4oRealtimePreview20241001;
        case r'gpt-4o-realtime-preview-2024-12-17': return RealtimeSessionCreateRequestModelEnum.gpt4oRealtimePreview20241217;
        case r'gpt-4o-mini-realtime-preview': return RealtimeSessionCreateRequestModelEnum.gpt4oMiniRealtimePreview;
        case r'gpt-4o-mini-realtime-preview-2024-12-17': return RealtimeSessionCreateRequestModelEnum.gpt4oMiniRealtimePreview20241217;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeSessionCreateRequestModelEnumTypeTransformer? _instance;
}


/// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
enum RealtimeSessionCreateRequestVoiceEnum {
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
  const RealtimeSessionCreateRequestVoiceEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeSessionCreateRequestVoiceEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeSessionCreateRequestVoiceEnum? fromJson(dynamic value) => RealtimeSessionCreateRequestVoiceEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeSessionCreateRequestVoiceEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeSessionCreateRequestVoiceEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionCreateRequestVoiceEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionCreateRequestVoiceEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionCreateRequestVoiceEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionCreateRequestVoiceEnum].
class RealtimeSessionCreateRequestVoiceEnumTypeTransformer {
  factory RealtimeSessionCreateRequestVoiceEnumTypeTransformer() => _instance ??= const RealtimeSessionCreateRequestVoiceEnumTypeTransformer._();

  const RealtimeSessionCreateRequestVoiceEnumTypeTransformer._();

  String encode(RealtimeSessionCreateRequestVoiceEnum data) => data._value;

  /// Returns the instance of [RealtimeSessionCreateRequestVoiceEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionCreateRequestVoiceEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeSessionCreateRequestVoiceEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'alloy': return RealtimeSessionCreateRequestVoiceEnum.alloy;
        case r'ash': return RealtimeSessionCreateRequestVoiceEnum.ash;
        case r'ballad': return RealtimeSessionCreateRequestVoiceEnum.ballad;
        case r'coral': return RealtimeSessionCreateRequestVoiceEnum.coral;
        case r'echo': return RealtimeSessionCreateRequestVoiceEnum.echo;
        case r'sage': return RealtimeSessionCreateRequestVoiceEnum.sage;
        case r'shimmer': return RealtimeSessionCreateRequestVoiceEnum.shimmer;
        case r'verse': return RealtimeSessionCreateRequestVoiceEnum.verse;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeSessionCreateRequestVoiceEnumTypeTransformer? _instance;
}


/// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
enum RealtimeSessionCreateRequestInputAudioFormatEnum {
  pcm16._(r'pcm16'),
  g711Ulaw._(r'g711_ulaw'),
  g711Alaw._(r'g711_alaw'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeSessionCreateRequestInputAudioFormatEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeSessionCreateRequestInputAudioFormatEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeSessionCreateRequestInputAudioFormatEnum? fromJson(dynamic value) => RealtimeSessionCreateRequestInputAudioFormatEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeSessionCreateRequestInputAudioFormatEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeSessionCreateRequestInputAudioFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionCreateRequestInputAudioFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionCreateRequestInputAudioFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionCreateRequestInputAudioFormatEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionCreateRequestInputAudioFormatEnum].
class RealtimeSessionCreateRequestInputAudioFormatEnumTypeTransformer {
  factory RealtimeSessionCreateRequestInputAudioFormatEnumTypeTransformer() => _instance ??= const RealtimeSessionCreateRequestInputAudioFormatEnumTypeTransformer._();

  const RealtimeSessionCreateRequestInputAudioFormatEnumTypeTransformer._();

  String encode(RealtimeSessionCreateRequestInputAudioFormatEnum data) => data._value;

  /// Returns the instance of [RealtimeSessionCreateRequestInputAudioFormatEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionCreateRequestInputAudioFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeSessionCreateRequestInputAudioFormatEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'pcm16': return RealtimeSessionCreateRequestInputAudioFormatEnum.pcm16;
        case r'g711_ulaw': return RealtimeSessionCreateRequestInputAudioFormatEnum.g711Ulaw;
        case r'g711_alaw': return RealtimeSessionCreateRequestInputAudioFormatEnum.g711Alaw;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeSessionCreateRequestInputAudioFormatEnumTypeTransformer? _instance;
}


/// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
enum RealtimeSessionCreateRequestOutputAudioFormatEnum {
  pcm16._(r'pcm16'),
  g711Ulaw._(r'g711_ulaw'),
  g711Alaw._(r'g711_alaw'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeSessionCreateRequestOutputAudioFormatEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeSessionCreateRequestOutputAudioFormatEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeSessionCreateRequestOutputAudioFormatEnum? fromJson(dynamic value) => RealtimeSessionCreateRequestOutputAudioFormatEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeSessionCreateRequestOutputAudioFormatEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeSessionCreateRequestOutputAudioFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionCreateRequestOutputAudioFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionCreateRequestOutputAudioFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionCreateRequestOutputAudioFormatEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionCreateRequestOutputAudioFormatEnum].
class RealtimeSessionCreateRequestOutputAudioFormatEnumTypeTransformer {
  factory RealtimeSessionCreateRequestOutputAudioFormatEnumTypeTransformer() => _instance ??= const RealtimeSessionCreateRequestOutputAudioFormatEnumTypeTransformer._();

  const RealtimeSessionCreateRequestOutputAudioFormatEnumTypeTransformer._();

  String encode(RealtimeSessionCreateRequestOutputAudioFormatEnum data) => data._value;

  /// Returns the instance of [RealtimeSessionCreateRequestOutputAudioFormatEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionCreateRequestOutputAudioFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeSessionCreateRequestOutputAudioFormatEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'pcm16': return RealtimeSessionCreateRequestOutputAudioFormatEnum.pcm16;
        case r'g711_ulaw': return RealtimeSessionCreateRequestOutputAudioFormatEnum.g711Ulaw;
        case r'g711_alaw': return RealtimeSessionCreateRequestOutputAudioFormatEnum.g711Alaw;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeSessionCreateRequestOutputAudioFormatEnumTypeTransformer? _instance;
}


