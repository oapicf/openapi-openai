//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeResponseCreateParams {
  /// Returns a new [RealtimeResponseCreateParams] instance.
  RealtimeResponseCreateParams({
    this.modalities = const [],
    this.instructions,
    this.voice,
    this.outputAudioFormat,
    this.tools = const [],
    this.toolChoice,
    this.temperature,
    this.maxResponseOutputTokens,
    this.conversation,
    this.metadata,
    this.input = const [],
  });

  /// The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  List<RealtimeResponseCreateParamsModalitiesEnum> modalities;

  /// The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? instructions;

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  RealtimeResponseCreateParamsVoiceEnum? voice;

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  RealtimeResponseCreateParamsOutputAudioFormatEnum? outputAudioFormat;

  /// Tools (functions) available to the model.
  List<RealtimeResponseCreateParamsToolsInner> tools;

  /// How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
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

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeResponseCreateParamsConversation? conversation;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  /// Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
  List<RealtimeConversationItem> input;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeResponseCreateParams &&
    _deepEquality.equals(other.modalities, modalities) &&
    other.instructions == instructions &&
    other.voice == voice &&
    other.outputAudioFormat == outputAudioFormat &&
    _deepEquality.equals(other.tools, tools) &&
    other.toolChoice == toolChoice &&
    other.temperature == temperature &&
    other.maxResponseOutputTokens == maxResponseOutputTokens &&
    other.conversation == conversation &&
    other.metadata == metadata &&
    _deepEquality.equals(other.input, input);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (modalities.hashCode) +
    (instructions == null ? 0 : instructions!.hashCode) +
    (voice == null ? 0 : voice!.hashCode) +
    (outputAudioFormat == null ? 0 : outputAudioFormat!.hashCode) +
    (tools.hashCode) +
    (toolChoice == null ? 0 : toolChoice!.hashCode) +
    (temperature == null ? 0 : temperature!.hashCode) +
    (maxResponseOutputTokens == null ? 0 : maxResponseOutputTokens!.hashCode) +
    (conversation == null ? 0 : conversation!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode) +
    (input.hashCode);

  @override
  String toString() => 'RealtimeResponseCreateParams[modalities=$modalities, instructions=$instructions, voice=$voice, outputAudioFormat=$outputAudioFormat, tools=$tools, toolChoice=$toolChoice, temperature=$temperature, maxResponseOutputTokens=$maxResponseOutputTokens, conversation=$conversation, metadata=$metadata, input=$input]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'modalities'] = this.modalities;
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
    if (this.outputAudioFormat != null) {
      json[r'output_audio_format'] = this.outputAudioFormat;
    } else {
      json[r'output_audio_format'] = null;
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
    if (this.conversation != null) {
      json[r'conversation'] = this.conversation;
    } else {
      json[r'conversation'] = null;
    }
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
      json[r'input'] = this.input;
    return json;
  }

  /// Returns a new [RealtimeResponseCreateParams] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeResponseCreateParams? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeResponseCreateParams[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeResponseCreateParams[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeResponseCreateParams(
        modalities: RealtimeResponseCreateParamsModalitiesEnum.listFromJson(json[r'modalities']),
        instructions: mapValueOfType<String>(json, r'instructions'),
        voice: RealtimeResponseCreateParamsVoiceEnum.fromJson(json[r'voice']),
        outputAudioFormat: RealtimeResponseCreateParamsOutputAudioFormatEnum.fromJson(json[r'output_audio_format']),
        tools: RealtimeResponseCreateParamsToolsInner.listFromJson(json[r'tools']),
        toolChoice: mapValueOfType<String>(json, r'tool_choice'),
        temperature: num.parse('${json[r'temperature']}'),
        maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens.fromJson(json[r'max_response_output_tokens']),
        conversation: RealtimeResponseCreateParamsConversation.fromJson(json[r'conversation']),
        metadata: mapValueOfType<Object>(json, r'metadata'),
        input: RealtimeConversationItem.listFromJson(json[r'input']),
      );
    }
    return null;
  }

  static List<RealtimeResponseCreateParams> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseCreateParams>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseCreateParams.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeResponseCreateParams> mapFromJson(dynamic json) {
    final map = <String, RealtimeResponseCreateParams>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeResponseCreateParams.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeResponseCreateParams-objects as value to a dart map
  static Map<String, List<RealtimeResponseCreateParams>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeResponseCreateParams>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeResponseCreateParams.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class RealtimeResponseCreateParamsModalitiesEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeResponseCreateParamsModalitiesEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = RealtimeResponseCreateParamsModalitiesEnum._(r'text');
  static const audio = RealtimeResponseCreateParamsModalitiesEnum._(r'audio');

  /// List of all possible values in this [enum][RealtimeResponseCreateParamsModalitiesEnum].
  static const values = <RealtimeResponseCreateParamsModalitiesEnum>[
    text,
    audio,
  ];

  static RealtimeResponseCreateParamsModalitiesEnum? fromJson(dynamic value) => RealtimeResponseCreateParamsModalitiesEnumTypeTransformer().decode(value);

  static List<RealtimeResponseCreateParamsModalitiesEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseCreateParamsModalitiesEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseCreateParamsModalitiesEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeResponseCreateParamsModalitiesEnum] to String,
/// and [decode] dynamic data back to [RealtimeResponseCreateParamsModalitiesEnum].
class RealtimeResponseCreateParamsModalitiesEnumTypeTransformer {
  factory RealtimeResponseCreateParamsModalitiesEnumTypeTransformer() => _instance ??= const RealtimeResponseCreateParamsModalitiesEnumTypeTransformer._();

  const RealtimeResponseCreateParamsModalitiesEnumTypeTransformer._();

  String encode(RealtimeResponseCreateParamsModalitiesEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeResponseCreateParamsModalitiesEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeResponseCreateParamsModalitiesEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return RealtimeResponseCreateParamsModalitiesEnum.text;
        case r'audio': return RealtimeResponseCreateParamsModalitiesEnum.audio;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeResponseCreateParamsModalitiesEnumTypeTransformer] instance.
  static RealtimeResponseCreateParamsModalitiesEnumTypeTransformer? _instance;
}


/// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
class RealtimeResponseCreateParamsVoiceEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeResponseCreateParamsVoiceEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const alloy = RealtimeResponseCreateParamsVoiceEnum._(r'alloy');
  static const ash = RealtimeResponseCreateParamsVoiceEnum._(r'ash');
  static const ballad = RealtimeResponseCreateParamsVoiceEnum._(r'ballad');
  static const coral = RealtimeResponseCreateParamsVoiceEnum._(r'coral');
  static const echo = RealtimeResponseCreateParamsVoiceEnum._(r'echo');
  static const sage = RealtimeResponseCreateParamsVoiceEnum._(r'sage');
  static const shimmer = RealtimeResponseCreateParamsVoiceEnum._(r'shimmer');
  static const verse = RealtimeResponseCreateParamsVoiceEnum._(r'verse');

  /// List of all possible values in this [enum][RealtimeResponseCreateParamsVoiceEnum].
  static const values = <RealtimeResponseCreateParamsVoiceEnum>[
    alloy,
    ash,
    ballad,
    coral,
    echo,
    sage,
    shimmer,
    verse,
  ];

  static RealtimeResponseCreateParamsVoiceEnum? fromJson(dynamic value) => RealtimeResponseCreateParamsVoiceEnumTypeTransformer().decode(value);

  static List<RealtimeResponseCreateParamsVoiceEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseCreateParamsVoiceEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseCreateParamsVoiceEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeResponseCreateParamsVoiceEnum] to String,
/// and [decode] dynamic data back to [RealtimeResponseCreateParamsVoiceEnum].
class RealtimeResponseCreateParamsVoiceEnumTypeTransformer {
  factory RealtimeResponseCreateParamsVoiceEnumTypeTransformer() => _instance ??= const RealtimeResponseCreateParamsVoiceEnumTypeTransformer._();

  const RealtimeResponseCreateParamsVoiceEnumTypeTransformer._();

  String encode(RealtimeResponseCreateParamsVoiceEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeResponseCreateParamsVoiceEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeResponseCreateParamsVoiceEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'alloy': return RealtimeResponseCreateParamsVoiceEnum.alloy;
        case r'ash': return RealtimeResponseCreateParamsVoiceEnum.ash;
        case r'ballad': return RealtimeResponseCreateParamsVoiceEnum.ballad;
        case r'coral': return RealtimeResponseCreateParamsVoiceEnum.coral;
        case r'echo': return RealtimeResponseCreateParamsVoiceEnum.echo;
        case r'sage': return RealtimeResponseCreateParamsVoiceEnum.sage;
        case r'shimmer': return RealtimeResponseCreateParamsVoiceEnum.shimmer;
        case r'verse': return RealtimeResponseCreateParamsVoiceEnum.verse;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeResponseCreateParamsVoiceEnumTypeTransformer] instance.
  static RealtimeResponseCreateParamsVoiceEnumTypeTransformer? _instance;
}


/// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
class RealtimeResponseCreateParamsOutputAudioFormatEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeResponseCreateParamsOutputAudioFormatEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const pcm16 = RealtimeResponseCreateParamsOutputAudioFormatEnum._(r'pcm16');
  static const g711Ulaw = RealtimeResponseCreateParamsOutputAudioFormatEnum._(r'g711_ulaw');
  static const g711Alaw = RealtimeResponseCreateParamsOutputAudioFormatEnum._(r'g711_alaw');

  /// List of all possible values in this [enum][RealtimeResponseCreateParamsOutputAudioFormatEnum].
  static const values = <RealtimeResponseCreateParamsOutputAudioFormatEnum>[
    pcm16,
    g711Ulaw,
    g711Alaw,
  ];

  static RealtimeResponseCreateParamsOutputAudioFormatEnum? fromJson(dynamic value) => RealtimeResponseCreateParamsOutputAudioFormatEnumTypeTransformer().decode(value);

  static List<RealtimeResponseCreateParamsOutputAudioFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseCreateParamsOutputAudioFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseCreateParamsOutputAudioFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeResponseCreateParamsOutputAudioFormatEnum] to String,
/// and [decode] dynamic data back to [RealtimeResponseCreateParamsOutputAudioFormatEnum].
class RealtimeResponseCreateParamsOutputAudioFormatEnumTypeTransformer {
  factory RealtimeResponseCreateParamsOutputAudioFormatEnumTypeTransformer() => _instance ??= const RealtimeResponseCreateParamsOutputAudioFormatEnumTypeTransformer._();

  const RealtimeResponseCreateParamsOutputAudioFormatEnumTypeTransformer._();

  String encode(RealtimeResponseCreateParamsOutputAudioFormatEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeResponseCreateParamsOutputAudioFormatEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeResponseCreateParamsOutputAudioFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'pcm16': return RealtimeResponseCreateParamsOutputAudioFormatEnum.pcm16;
        case r'g711_ulaw': return RealtimeResponseCreateParamsOutputAudioFormatEnum.g711Ulaw;
        case r'g711_alaw': return RealtimeResponseCreateParamsOutputAudioFormatEnum.g711Alaw;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeResponseCreateParamsOutputAudioFormatEnumTypeTransformer] instance.
  static RealtimeResponseCreateParamsOutputAudioFormatEnumTypeTransformer? _instance;
}


