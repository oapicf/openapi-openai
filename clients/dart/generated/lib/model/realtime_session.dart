//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeSession {
  /// Returns a new [RealtimeSession] instance.
  RealtimeSession({
    this.id,
    this.modalities = const [],
    this.model,
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

  /// Unique identifier for the session object. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  List<RealtimeSessionModalitiesEnum> modalities;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeSessionModel? model;

  /// The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? instructions;

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  RealtimeSessionVoiceEnum? voice;

  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  RealtimeSessionInputAudioFormatEnum? inputAudioFormat;

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  RealtimeSessionOutputAudioFormatEnum? outputAudioFormat;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeSessionInputAudioTranscription? inputAudioTranscription;

  RealtimeSessionTurnDetection? turnDetection;

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
  bool operator ==(Object other) => identical(this, other) || other is RealtimeSession &&
    other.id == id &&
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
    (id == null ? 0 : id!.hashCode) +
    (modalities.hashCode) +
    (model == null ? 0 : model!.hashCode) +
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
  String toString() => 'RealtimeSession[id=$id, modalities=$modalities, model=$model, instructions=$instructions, voice=$voice, inputAudioFormat=$inputAudioFormat, outputAudioFormat=$outputAudioFormat, inputAudioTranscription=$inputAudioTranscription, turnDetection=$turnDetection, tools=$tools, toolChoice=$toolChoice, temperature=$temperature, maxResponseOutputTokens=$maxResponseOutputTokens]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'modalities'] = this.modalities;
    if (this.model != null) {
      json[r'model'] = this.model;
    } else {
      json[r'model'] = null;
    }
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

  /// Returns a new [RealtimeSession] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeSession? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeSession[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeSession[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeSession(
        id: mapValueOfType<String>(json, r'id'),
        modalities: RealtimeSessionModalitiesEnum.listFromJson(json[r'modalities']),
        model: RealtimeSessionModel.fromJson(json[r'model']),
        instructions: mapValueOfType<String>(json, r'instructions'),
        voice: RealtimeSessionVoiceEnum.fromJson(json[r'voice']),
        inputAudioFormat: RealtimeSessionInputAudioFormatEnum.fromJson(json[r'input_audio_format']),
        outputAudioFormat: RealtimeSessionOutputAudioFormatEnum.fromJson(json[r'output_audio_format']),
        inputAudioTranscription: RealtimeSessionInputAudioTranscription.fromJson(json[r'input_audio_transcription']),
        turnDetection: RealtimeSessionTurnDetection.fromJson(json[r'turn_detection']),
        tools: RealtimeResponseCreateParamsToolsInner.listFromJson(json[r'tools']),
        toolChoice: mapValueOfType<String>(json, r'tool_choice'),
        temperature: num.parse('${json[r'temperature']}'),
        maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens.fromJson(json[r'max_response_output_tokens']),
      );
    }
    return null;
  }

  static List<RealtimeSession> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSession>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSession.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeSession> mapFromJson(dynamic json) {
    final map = <String, RealtimeSession>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeSession.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeSession-objects as value to a dart map
  static Map<String, List<RealtimeSession>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeSession>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeSession.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class RealtimeSessionModalitiesEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeSessionModalitiesEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = RealtimeSessionModalitiesEnum._(r'text');
  static const audio = RealtimeSessionModalitiesEnum._(r'audio');

  /// List of all possible values in this [enum][RealtimeSessionModalitiesEnum].
  static const values = <RealtimeSessionModalitiesEnum>[
    text,
    audio,
  ];

  static RealtimeSessionModalitiesEnum? fromJson(dynamic value) => RealtimeSessionModalitiesEnumTypeTransformer().decode(value);

  static List<RealtimeSessionModalitiesEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionModalitiesEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionModalitiesEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionModalitiesEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionModalitiesEnum].
class RealtimeSessionModalitiesEnumTypeTransformer {
  factory RealtimeSessionModalitiesEnumTypeTransformer() => _instance ??= const RealtimeSessionModalitiesEnumTypeTransformer._();

  const RealtimeSessionModalitiesEnumTypeTransformer._();

  String encode(RealtimeSessionModalitiesEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeSessionModalitiesEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionModalitiesEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return RealtimeSessionModalitiesEnum.text;
        case r'audio': return RealtimeSessionModalitiesEnum.audio;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeSessionModalitiesEnumTypeTransformer] instance.
  static RealtimeSessionModalitiesEnumTypeTransformer? _instance;
}


/// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
class RealtimeSessionVoiceEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeSessionVoiceEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const alloy = RealtimeSessionVoiceEnum._(r'alloy');
  static const ash = RealtimeSessionVoiceEnum._(r'ash');
  static const ballad = RealtimeSessionVoiceEnum._(r'ballad');
  static const coral = RealtimeSessionVoiceEnum._(r'coral');
  static const echo = RealtimeSessionVoiceEnum._(r'echo');
  static const sage = RealtimeSessionVoiceEnum._(r'sage');
  static const shimmer = RealtimeSessionVoiceEnum._(r'shimmer');
  static const verse = RealtimeSessionVoiceEnum._(r'verse');

  /// List of all possible values in this [enum][RealtimeSessionVoiceEnum].
  static const values = <RealtimeSessionVoiceEnum>[
    alloy,
    ash,
    ballad,
    coral,
    echo,
    sage,
    shimmer,
    verse,
  ];

  static RealtimeSessionVoiceEnum? fromJson(dynamic value) => RealtimeSessionVoiceEnumTypeTransformer().decode(value);

  static List<RealtimeSessionVoiceEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionVoiceEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionVoiceEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionVoiceEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionVoiceEnum].
class RealtimeSessionVoiceEnumTypeTransformer {
  factory RealtimeSessionVoiceEnumTypeTransformer() => _instance ??= const RealtimeSessionVoiceEnumTypeTransformer._();

  const RealtimeSessionVoiceEnumTypeTransformer._();

  String encode(RealtimeSessionVoiceEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeSessionVoiceEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionVoiceEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'alloy': return RealtimeSessionVoiceEnum.alloy;
        case r'ash': return RealtimeSessionVoiceEnum.ash;
        case r'ballad': return RealtimeSessionVoiceEnum.ballad;
        case r'coral': return RealtimeSessionVoiceEnum.coral;
        case r'echo': return RealtimeSessionVoiceEnum.echo;
        case r'sage': return RealtimeSessionVoiceEnum.sage;
        case r'shimmer': return RealtimeSessionVoiceEnum.shimmer;
        case r'verse': return RealtimeSessionVoiceEnum.verse;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeSessionVoiceEnumTypeTransformer] instance.
  static RealtimeSessionVoiceEnumTypeTransformer? _instance;
}


/// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
class RealtimeSessionInputAudioFormatEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeSessionInputAudioFormatEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const pcm16 = RealtimeSessionInputAudioFormatEnum._(r'pcm16');
  static const g711Ulaw = RealtimeSessionInputAudioFormatEnum._(r'g711_ulaw');
  static const g711Alaw = RealtimeSessionInputAudioFormatEnum._(r'g711_alaw');

  /// List of all possible values in this [enum][RealtimeSessionInputAudioFormatEnum].
  static const values = <RealtimeSessionInputAudioFormatEnum>[
    pcm16,
    g711Ulaw,
    g711Alaw,
  ];

  static RealtimeSessionInputAudioFormatEnum? fromJson(dynamic value) => RealtimeSessionInputAudioFormatEnumTypeTransformer().decode(value);

  static List<RealtimeSessionInputAudioFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionInputAudioFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionInputAudioFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionInputAudioFormatEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionInputAudioFormatEnum].
class RealtimeSessionInputAudioFormatEnumTypeTransformer {
  factory RealtimeSessionInputAudioFormatEnumTypeTransformer() => _instance ??= const RealtimeSessionInputAudioFormatEnumTypeTransformer._();

  const RealtimeSessionInputAudioFormatEnumTypeTransformer._();

  String encode(RealtimeSessionInputAudioFormatEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeSessionInputAudioFormatEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionInputAudioFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'pcm16': return RealtimeSessionInputAudioFormatEnum.pcm16;
        case r'g711_ulaw': return RealtimeSessionInputAudioFormatEnum.g711Ulaw;
        case r'g711_alaw': return RealtimeSessionInputAudioFormatEnum.g711Alaw;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeSessionInputAudioFormatEnumTypeTransformer] instance.
  static RealtimeSessionInputAudioFormatEnumTypeTransformer? _instance;
}


/// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
class RealtimeSessionOutputAudioFormatEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeSessionOutputAudioFormatEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const pcm16 = RealtimeSessionOutputAudioFormatEnum._(r'pcm16');
  static const g711Ulaw = RealtimeSessionOutputAudioFormatEnum._(r'g711_ulaw');
  static const g711Alaw = RealtimeSessionOutputAudioFormatEnum._(r'g711_alaw');

  /// List of all possible values in this [enum][RealtimeSessionOutputAudioFormatEnum].
  static const values = <RealtimeSessionOutputAudioFormatEnum>[
    pcm16,
    g711Ulaw,
    g711Alaw,
  ];

  static RealtimeSessionOutputAudioFormatEnum? fromJson(dynamic value) => RealtimeSessionOutputAudioFormatEnumTypeTransformer().decode(value);

  static List<RealtimeSessionOutputAudioFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionOutputAudioFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionOutputAudioFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionOutputAudioFormatEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionOutputAudioFormatEnum].
class RealtimeSessionOutputAudioFormatEnumTypeTransformer {
  factory RealtimeSessionOutputAudioFormatEnumTypeTransformer() => _instance ??= const RealtimeSessionOutputAudioFormatEnumTypeTransformer._();

  const RealtimeSessionOutputAudioFormatEnumTypeTransformer._();

  String encode(RealtimeSessionOutputAudioFormatEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeSessionOutputAudioFormatEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionOutputAudioFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'pcm16': return RealtimeSessionOutputAudioFormatEnum.pcm16;
        case r'g711_ulaw': return RealtimeSessionOutputAudioFormatEnum.g711Ulaw;
        case r'g711_alaw': return RealtimeSessionOutputAudioFormatEnum.g711Alaw;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeSessionOutputAudioFormatEnumTypeTransformer] instance.
  static RealtimeSessionOutputAudioFormatEnumTypeTransformer? _instance;
}


