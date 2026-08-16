//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatCompletionStreamResponse {
  /// Returns a new [CreateChatCompletionStreamResponse] instance.
  CreateChatCompletionStreamResponse({
    required this.id,
    this.choices = const [],
    required this.created,
    required this.model,
    this.serviceTier,
    this.systemFingerprint,
    required this.object,
    this.usage,
  });

  /// A unique identifier for the chat completion. Each chunk has the same ID.
  String id;

  /// A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
  List<CreateChatCompletionStreamResponseChoicesInner> choices;

  /// The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
  int created;

  /// The model to generate the completion.
  String model;

  /// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  CreateChatCompletionStreamResponseServiceTierEnum? serviceTier;

  /// This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? systemFingerprint;

  /// The object type, which is always `chat.completion.chunk`.
  CreateChatCompletionStreamResponseObjectEnum object;

  CreateChatCompletionStreamResponseUsage? usage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatCompletionStreamResponse &&
    other.id == id &&
    _deepEquality.equals(other.choices, choices) &&
    other.created == created &&
    other.model == model &&
    other.serviceTier == serviceTier &&
    other.systemFingerprint == systemFingerprint &&
    other.object == object &&
    other.usage == usage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (choices.hashCode) +
    (created.hashCode) +
    (model.hashCode) +
    (serviceTier == null ? 0 : serviceTier!.hashCode) +
    (systemFingerprint == null ? 0 : systemFingerprint!.hashCode) +
    (object.hashCode) +
    (usage == null ? 0 : usage!.hashCode);

  @override
  String toString() => 'CreateChatCompletionStreamResponse[id=$id, choices=$choices, created=$created, model=$model, serviceTier=$serviceTier, systemFingerprint=$systemFingerprint, object=$object, usage=$usage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'choices'] = this.choices;
      json[r'created'] = this.created;
      json[r'model'] = this.model;
    if (this.serviceTier != null) {
      json[r'service_tier'] = this.serviceTier;
    } else {
      json[r'service_tier'] = null;
    }
    if (this.systemFingerprint != null) {
      json[r'system_fingerprint'] = this.systemFingerprint;
    } else {
      json[r'system_fingerprint'] = null;
    }
      json[r'object'] = this.object;
    if (this.usage != null) {
      json[r'usage'] = this.usage;
    } else {
      json[r'usage'] = null;
    }
    return json;
  }

  /// Returns a new [CreateChatCompletionStreamResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatCompletionStreamResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateChatCompletionStreamResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateChatCompletionStreamResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateChatCompletionStreamResponse(
        id: mapValueOfType<String>(json, r'id')!,
        choices: CreateChatCompletionStreamResponseChoicesInner.listFromJson(json[r'choices']),
        created: mapValueOfType<int>(json, r'created')!,
        model: mapValueOfType<String>(json, r'model')!,
        serviceTier: CreateChatCompletionStreamResponseServiceTierEnum.fromJson(json[r'service_tier']),
        systemFingerprint: mapValueOfType<String>(json, r'system_fingerprint'),
        object: CreateChatCompletionStreamResponseObjectEnum.fromJson(json[r'object'])!,
        usage: CreateChatCompletionStreamResponseUsage.fromJson(json[r'usage']),
      );
    }
    return null;
  }

  static List<CreateChatCompletionStreamResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionStreamResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionStreamResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatCompletionStreamResponse> mapFromJson(dynamic json) {
    final map = <String, CreateChatCompletionStreamResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatCompletionStreamResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatCompletionStreamResponse-objects as value to a dart map
  static Map<String, List<CreateChatCompletionStreamResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatCompletionStreamResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatCompletionStreamResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'choices',
    'created',
    'model',
    'object',
  };
}

/// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
class CreateChatCompletionStreamResponseServiceTierEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateChatCompletionStreamResponseServiceTierEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const scale = CreateChatCompletionStreamResponseServiceTierEnum._(r'scale');
  static const default_ = CreateChatCompletionStreamResponseServiceTierEnum._(r'default');

  /// List of all possible values in this [enum][CreateChatCompletionStreamResponseServiceTierEnum].
  static const values = <CreateChatCompletionStreamResponseServiceTierEnum>[
    scale,
    default_,
  ];

  static CreateChatCompletionStreamResponseServiceTierEnum? fromJson(dynamic value) => CreateChatCompletionStreamResponseServiceTierEnumTypeTransformer().decode(value);

  static List<CreateChatCompletionStreamResponseServiceTierEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionStreamResponseServiceTierEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionStreamResponseServiceTierEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionStreamResponseServiceTierEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionStreamResponseServiceTierEnum].
class CreateChatCompletionStreamResponseServiceTierEnumTypeTransformer {
  factory CreateChatCompletionStreamResponseServiceTierEnumTypeTransformer() => _instance ??= const CreateChatCompletionStreamResponseServiceTierEnumTypeTransformer._();

  const CreateChatCompletionStreamResponseServiceTierEnumTypeTransformer._();

  String encode(CreateChatCompletionStreamResponseServiceTierEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateChatCompletionStreamResponseServiceTierEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionStreamResponseServiceTierEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'scale': return CreateChatCompletionStreamResponseServiceTierEnum.scale;
        case r'default': return CreateChatCompletionStreamResponseServiceTierEnum.default_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateChatCompletionStreamResponseServiceTierEnumTypeTransformer] instance.
  static CreateChatCompletionStreamResponseServiceTierEnumTypeTransformer? _instance;
}


/// The object type, which is always `chat.completion.chunk`.
class CreateChatCompletionStreamResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateChatCompletionStreamResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const chatPeriodCompletionPeriodChunk = CreateChatCompletionStreamResponseObjectEnum._(r'chat.completion.chunk');

  /// List of all possible values in this [enum][CreateChatCompletionStreamResponseObjectEnum].
  static const values = <CreateChatCompletionStreamResponseObjectEnum>[
    chatPeriodCompletionPeriodChunk,
  ];

  static CreateChatCompletionStreamResponseObjectEnum? fromJson(dynamic value) => CreateChatCompletionStreamResponseObjectEnumTypeTransformer().decode(value);

  static List<CreateChatCompletionStreamResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionStreamResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionStreamResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionStreamResponseObjectEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionStreamResponseObjectEnum].
class CreateChatCompletionStreamResponseObjectEnumTypeTransformer {
  factory CreateChatCompletionStreamResponseObjectEnumTypeTransformer() => _instance ??= const CreateChatCompletionStreamResponseObjectEnumTypeTransformer._();

  const CreateChatCompletionStreamResponseObjectEnumTypeTransformer._();

  String encode(CreateChatCompletionStreamResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateChatCompletionStreamResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionStreamResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'chat.completion.chunk': return CreateChatCompletionStreamResponseObjectEnum.chatPeriodCompletionPeriodChunk;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateChatCompletionStreamResponseObjectEnumTypeTransformer] instance.
  static CreateChatCompletionStreamResponseObjectEnumTypeTransformer? _instance;
}


