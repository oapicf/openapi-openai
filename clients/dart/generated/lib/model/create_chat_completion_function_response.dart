//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatCompletionFunctionResponse {
  /// Returns a new [CreateChatCompletionFunctionResponse] instance.
  CreateChatCompletionFunctionResponse({
    required this.id,
    this.choices = const [],
    required this.created,
    required this.model,
    this.systemFingerprint,
    required this.object,
    this.usage,
  });

  /// A unique identifier for the chat completion.
  String id;

  /// A list of chat completion choices. Can be more than one if `n` is greater than 1.
  List<CreateChatCompletionFunctionResponseChoicesInner> choices;

  /// The Unix timestamp (in seconds) of when the chat completion was created.
  int created;

  /// The model used for the chat completion.
  String model;

  /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? systemFingerprint;

  /// The object type, which is always `chat.completion`.
  CreateChatCompletionFunctionResponseObjectEnum object;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CompletionUsage? usage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatCompletionFunctionResponse &&
    other.id == id &&
    _deepEquality.equals(other.choices, choices) &&
    other.created == created &&
    other.model == model &&
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
    (systemFingerprint == null ? 0 : systemFingerprint!.hashCode) +
    (object.hashCode) +
    (usage == null ? 0 : usage!.hashCode);

  @override
  String toString() => 'CreateChatCompletionFunctionResponse[id=$id, choices=$choices, created=$created, model=$model, systemFingerprint=$systemFingerprint, object=$object, usage=$usage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'choices'] = this.choices;
      json[r'created'] = this.created;
      json[r'model'] = this.model;
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

  /// Returns a new [CreateChatCompletionFunctionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatCompletionFunctionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateChatCompletionFunctionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateChatCompletionFunctionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateChatCompletionFunctionResponse(
        id: mapValueOfType<String>(json, r'id')!,
        choices: CreateChatCompletionFunctionResponseChoicesInner.listFromJson(json[r'choices']),
        created: mapValueOfType<int>(json, r'created')!,
        model: mapValueOfType<String>(json, r'model')!,
        systemFingerprint: mapValueOfType<String>(json, r'system_fingerprint'),
        object: CreateChatCompletionFunctionResponseObjectEnum.fromJson(json[r'object'])!,
        usage: CompletionUsage.fromJson(json[r'usage']),
      );
    }
    return null;
  }

  static List<CreateChatCompletionFunctionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionFunctionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionFunctionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatCompletionFunctionResponse> mapFromJson(dynamic json) {
    final map = <String, CreateChatCompletionFunctionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatCompletionFunctionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatCompletionFunctionResponse-objects as value to a dart map
  static Map<String, List<CreateChatCompletionFunctionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatCompletionFunctionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatCompletionFunctionResponse.listFromJson(entry.value, growable: growable,);
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

/// The object type, which is always `chat.completion`.
class CreateChatCompletionFunctionResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateChatCompletionFunctionResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const chatPeriodCompletion = CreateChatCompletionFunctionResponseObjectEnum._(r'chat.completion');

  /// List of all possible values in this [enum][CreateChatCompletionFunctionResponseObjectEnum].
  static const values = <CreateChatCompletionFunctionResponseObjectEnum>[
    chatPeriodCompletion,
  ];

  static CreateChatCompletionFunctionResponseObjectEnum? fromJson(dynamic value) => CreateChatCompletionFunctionResponseObjectEnumTypeTransformer().decode(value);

  static List<CreateChatCompletionFunctionResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionFunctionResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionFunctionResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionFunctionResponseObjectEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionFunctionResponseObjectEnum].
class CreateChatCompletionFunctionResponseObjectEnumTypeTransformer {
  factory CreateChatCompletionFunctionResponseObjectEnumTypeTransformer() => _instance ??= const CreateChatCompletionFunctionResponseObjectEnumTypeTransformer._();

  const CreateChatCompletionFunctionResponseObjectEnumTypeTransformer._();

  String encode(CreateChatCompletionFunctionResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateChatCompletionFunctionResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionFunctionResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'chat.completion': return CreateChatCompletionFunctionResponseObjectEnum.chatPeriodCompletion;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateChatCompletionFunctionResponseObjectEnumTypeTransformer] instance.
  static CreateChatCompletionFunctionResponseObjectEnumTypeTransformer? _instance;
}


