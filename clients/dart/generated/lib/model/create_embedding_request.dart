//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateEmbeddingRequest {
  /// Returns a new [CreateEmbeddingRequest] instance.
  CreateEmbeddingRequest({
    required this.input,
    required this.model,
    this.encodingFormat = const CreateEmbeddingRequestEncodingFormatEnum._('float'),
    this.dimensions,
    this.user,
  });

  CreateEmbeddingRequestInput input;

  CreateEmbeddingRequestModel model;

  /// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
  CreateEmbeddingRequestEncodingFormatEnum encodingFormat;

  /// The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
  ///
  /// Minimum value: 1
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? dimensions;

  /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? user;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateEmbeddingRequest &&
    other.input == input &&
    other.model == model &&
    other.encodingFormat == encodingFormat &&
    other.dimensions == dimensions &&
    other.user == user;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (input.hashCode) +
    (model.hashCode) +
    (encodingFormat.hashCode) +
    (dimensions == null ? 0 : dimensions!.hashCode) +
    (user == null ? 0 : user!.hashCode);

  @override
  String toString() => 'CreateEmbeddingRequest[input=$input, model=$model, encodingFormat=$encodingFormat, dimensions=$dimensions, user=$user]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'input'] = this.input;
      json[r'model'] = this.model;
      json[r'encoding_format'] = this.encodingFormat;
    if (this.dimensions != null) {
      json[r'dimensions'] = this.dimensions;
    } else {
      json[r'dimensions'] = null;
    }
    if (this.user != null) {
      json[r'user'] = this.user;
    } else {
      json[r'user'] = null;
    }
    return json;
  }

  /// Returns a new [CreateEmbeddingRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateEmbeddingRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateEmbeddingRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateEmbeddingRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateEmbeddingRequest(
        input: CreateEmbeddingRequestInput.fromJson(json[r'input'])!,
        model: CreateEmbeddingRequestModel.fromJson(json[r'model'])!,
        encodingFormat: CreateEmbeddingRequestEncodingFormatEnum.fromJson(json[r'encoding_format']) ?? 'float',
        dimensions: mapValueOfType<int>(json, r'dimensions'),
        user: mapValueOfType<String>(json, r'user'),
      );
    }
    return null;
  }

  static List<CreateEmbeddingRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateEmbeddingRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateEmbeddingRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateEmbeddingRequest> mapFromJson(dynamic json) {
    final map = <String, CreateEmbeddingRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateEmbeddingRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateEmbeddingRequest-objects as value to a dart map
  static Map<String, List<CreateEmbeddingRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateEmbeddingRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateEmbeddingRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'input',
    'model',
  };
}

/// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
class CreateEmbeddingRequestEncodingFormatEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateEmbeddingRequestEncodingFormatEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const float = CreateEmbeddingRequestEncodingFormatEnum._(r'float');
  static const base64 = CreateEmbeddingRequestEncodingFormatEnum._(r'base64');

  /// List of all possible values in this [enum][CreateEmbeddingRequestEncodingFormatEnum].
  static const values = <CreateEmbeddingRequestEncodingFormatEnum>[
    float,
    base64,
  ];

  static CreateEmbeddingRequestEncodingFormatEnum? fromJson(dynamic value) => CreateEmbeddingRequestEncodingFormatEnumTypeTransformer().decode(value);

  static List<CreateEmbeddingRequestEncodingFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateEmbeddingRequestEncodingFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateEmbeddingRequestEncodingFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateEmbeddingRequestEncodingFormatEnum] to String,
/// and [decode] dynamic data back to [CreateEmbeddingRequestEncodingFormatEnum].
class CreateEmbeddingRequestEncodingFormatEnumTypeTransformer {
  factory CreateEmbeddingRequestEncodingFormatEnumTypeTransformer() => _instance ??= const CreateEmbeddingRequestEncodingFormatEnumTypeTransformer._();

  const CreateEmbeddingRequestEncodingFormatEnumTypeTransformer._();

  String encode(CreateEmbeddingRequestEncodingFormatEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateEmbeddingRequestEncodingFormatEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateEmbeddingRequestEncodingFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'float': return CreateEmbeddingRequestEncodingFormatEnum.float;
        case r'base64': return CreateEmbeddingRequestEncodingFormatEnum.base64;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateEmbeddingRequestEncodingFormatEnumTypeTransformer] instance.
  static CreateEmbeddingRequestEncodingFormatEnumTypeTransformer? _instance;
}


