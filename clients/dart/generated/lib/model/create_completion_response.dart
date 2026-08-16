//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateCompletionResponse {
  /// Returns a new [CreateCompletionResponse] instance.
  CreateCompletionResponse({
    required this.id,
    this.choices = const [],
    required this.created,
    required this.model,
    this.systemFingerprint,
    required this.object,
    this.usage,
  });

  /// A unique identifier for the completion.
  String id;

  /// The list of completion choices the model generated for the input prompt.
  List<CreateCompletionResponseChoicesInner> choices;

  /// The Unix timestamp (in seconds) of when the completion was created.
  int created;

  /// The model used for completion.
  String model;

  /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? systemFingerprint;

  /// The object type, which is always \"text_completion\"
  CreateCompletionResponseObjectEnum object;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CompletionUsage? usage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateCompletionResponse &&
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
  String toString() => 'CreateCompletionResponse[id=$id, choices=$choices, created=$created, model=$model, systemFingerprint=$systemFingerprint, object=$object, usage=$usage]';

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

  /// Returns a new [CreateCompletionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateCompletionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateCompletionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateCompletionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateCompletionResponse(
        id: mapValueOfType<String>(json, r'id')!,
        choices: CreateCompletionResponseChoicesInner.listFromJson(json[r'choices']),
        created: mapValueOfType<int>(json, r'created')!,
        model: mapValueOfType<String>(json, r'model')!,
        systemFingerprint: mapValueOfType<String>(json, r'system_fingerprint'),
        object: CreateCompletionResponseObjectEnum.fromJson(json[r'object'])!,
        usage: CompletionUsage.fromJson(json[r'usage']),
      );
    }
    return null;
  }

  static List<CreateCompletionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateCompletionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateCompletionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateCompletionResponse> mapFromJson(dynamic json) {
    final map = <String, CreateCompletionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateCompletionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateCompletionResponse-objects as value to a dart map
  static Map<String, List<CreateCompletionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateCompletionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateCompletionResponse.listFromJson(entry.value, growable: growable,);
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

/// The object type, which is always \"text_completion\"
class CreateCompletionResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateCompletionResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const textCompletion = CreateCompletionResponseObjectEnum._(r'text_completion');

  /// List of all possible values in this [enum][CreateCompletionResponseObjectEnum].
  static const values = <CreateCompletionResponseObjectEnum>[
    textCompletion,
  ];

  static CreateCompletionResponseObjectEnum? fromJson(dynamic value) => CreateCompletionResponseObjectEnumTypeTransformer().decode(value);

  static List<CreateCompletionResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateCompletionResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateCompletionResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateCompletionResponseObjectEnum] to String,
/// and [decode] dynamic data back to [CreateCompletionResponseObjectEnum].
class CreateCompletionResponseObjectEnumTypeTransformer {
  factory CreateCompletionResponseObjectEnumTypeTransformer() => _instance ??= const CreateCompletionResponseObjectEnumTypeTransformer._();

  const CreateCompletionResponseObjectEnumTypeTransformer._();

  String encode(CreateCompletionResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateCompletionResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateCompletionResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text_completion': return CreateCompletionResponseObjectEnum.textCompletion;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateCompletionResponseObjectEnumTypeTransformer] instance.
  static CreateCompletionResponseObjectEnumTypeTransformer? _instance;
}


