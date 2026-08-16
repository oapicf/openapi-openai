//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateBatchRequest {
  /// Returns a new [CreateBatchRequest] instance.
  CreateBatchRequest({
    required this.inputFileId,
    required this.endpoint,
    required this.completionWindow,
    this.metadata = const {},
  });

  /// The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
  String inputFileId;

  /// The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
  CreateBatchRequestEndpointEnum endpoint;

  /// The time frame within which the batch should be processed. Currently only `24h` is supported.
  CreateBatchRequestCompletionWindowEnum completionWindow;

  /// Optional custom metadata for the batch.
  Map<String, String>? metadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateBatchRequest &&
    other.inputFileId == inputFileId &&
    other.endpoint == endpoint &&
    other.completionWindow == completionWindow &&
    _deepEquality.equals(other.metadata, metadata);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (inputFileId.hashCode) +
    (endpoint.hashCode) +
    (completionWindow.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode);

  @override
  String toString() => 'CreateBatchRequest[inputFileId=$inputFileId, endpoint=$endpoint, completionWindow=$completionWindow, metadata=$metadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'input_file_id'] = this.inputFileId;
      json[r'endpoint'] = this.endpoint;
      json[r'completion_window'] = this.completionWindow;
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
    return json;
  }

  /// Returns a new [CreateBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateBatchRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateBatchRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateBatchRequest(
        inputFileId: mapValueOfType<String>(json, r'input_file_id')!,
        endpoint: CreateBatchRequestEndpointEnum.fromJson(json[r'endpoint'])!,
        completionWindow: CreateBatchRequestCompletionWindowEnum.fromJson(json[r'completion_window'])!,
        metadata: mapCastOfType<String, String>(json, r'metadata') ?? const {},
      );
    }
    return null;
  }

  static List<CreateBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CreateBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateBatchRequest-objects as value to a dart map
  static Map<String, List<CreateBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateBatchRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'input_file_id',
    'endpoint',
    'completion_window',
  };
}

/// The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
class CreateBatchRequestEndpointEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateBatchRequestEndpointEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const slashV1SlashChatSlashCompletions = CreateBatchRequestEndpointEnum._(r'/v1/chat/completions');
  static const slashV1SlashEmbeddings = CreateBatchRequestEndpointEnum._(r'/v1/embeddings');
  static const slashV1SlashCompletions = CreateBatchRequestEndpointEnum._(r'/v1/completions');

  /// List of all possible values in this [enum][CreateBatchRequestEndpointEnum].
  static const values = <CreateBatchRequestEndpointEnum>[
    slashV1SlashChatSlashCompletions,
    slashV1SlashEmbeddings,
    slashV1SlashCompletions,
  ];

  static CreateBatchRequestEndpointEnum? fromJson(dynamic value) => CreateBatchRequestEndpointEnumTypeTransformer().decode(value);

  static List<CreateBatchRequestEndpointEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateBatchRequestEndpointEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateBatchRequestEndpointEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateBatchRequestEndpointEnum] to String,
/// and [decode] dynamic data back to [CreateBatchRequestEndpointEnum].
class CreateBatchRequestEndpointEnumTypeTransformer {
  factory CreateBatchRequestEndpointEnumTypeTransformer() => _instance ??= const CreateBatchRequestEndpointEnumTypeTransformer._();

  const CreateBatchRequestEndpointEnumTypeTransformer._();

  String encode(CreateBatchRequestEndpointEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateBatchRequestEndpointEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateBatchRequestEndpointEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'/v1/chat/completions': return CreateBatchRequestEndpointEnum.slashV1SlashChatSlashCompletions;
        case r'/v1/embeddings': return CreateBatchRequestEndpointEnum.slashV1SlashEmbeddings;
        case r'/v1/completions': return CreateBatchRequestEndpointEnum.slashV1SlashCompletions;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateBatchRequestEndpointEnumTypeTransformer] instance.
  static CreateBatchRequestEndpointEnumTypeTransformer? _instance;
}


/// The time frame within which the batch should be processed. Currently only `24h` is supported.
class CreateBatchRequestCompletionWindowEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateBatchRequestCompletionWindowEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const n24h = CreateBatchRequestCompletionWindowEnum._(r'24h');

  /// List of all possible values in this [enum][CreateBatchRequestCompletionWindowEnum].
  static const values = <CreateBatchRequestCompletionWindowEnum>[
    n24h,
  ];

  static CreateBatchRequestCompletionWindowEnum? fromJson(dynamic value) => CreateBatchRequestCompletionWindowEnumTypeTransformer().decode(value);

  static List<CreateBatchRequestCompletionWindowEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateBatchRequestCompletionWindowEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateBatchRequestCompletionWindowEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateBatchRequestCompletionWindowEnum] to String,
/// and [decode] dynamic data back to [CreateBatchRequestCompletionWindowEnum].
class CreateBatchRequestCompletionWindowEnumTypeTransformer {
  factory CreateBatchRequestCompletionWindowEnumTypeTransformer() => _instance ??= const CreateBatchRequestCompletionWindowEnumTypeTransformer._();

  const CreateBatchRequestCompletionWindowEnumTypeTransformer._();

  String encode(CreateBatchRequestCompletionWindowEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateBatchRequestCompletionWindowEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateBatchRequestCompletionWindowEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'24h': return CreateBatchRequestCompletionWindowEnum.n24h;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateBatchRequestCompletionWindowEnumTypeTransformer] instance.
  static CreateBatchRequestCompletionWindowEnumTypeTransformer? _instance;
}


