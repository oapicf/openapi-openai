//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Batch {
  /// Returns a new [Batch] instance.
  Batch({
    required this.id,
    required this.object,
    required this.endpoint,
    this.errors,
    required this.inputFileId,
    required this.completionWindow,
    required this.status,
    this.outputFileId,
    this.errorFileId,
    required this.createdAt,
    this.inProgressAt,
    this.expiresAt,
    this.finalizingAt,
    this.completedAt,
    this.failedAt,
    this.expiredAt,
    this.cancellingAt,
    this.cancelledAt,
    this.requestCounts,
    this.metadata,
  });

  String id;

  /// The object type, which is always `batch`.
  BatchObjectEnum object;

  /// The OpenAI API endpoint used by the batch.
  String endpoint;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BatchErrors? errors;

  /// The ID of the input file for the batch.
  String inputFileId;

  /// The time frame within which the batch should be processed.
  String completionWindow;

  /// The current status of the batch.
  BatchStatusEnum status;

  /// The ID of the file containing the outputs of successfully executed requests.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? outputFileId;

  /// The ID of the file containing the outputs of requests with errors.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? errorFileId;

  /// The Unix timestamp (in seconds) for when the batch was created.
  int createdAt;

  /// The Unix timestamp (in seconds) for when the batch started processing.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? inProgressAt;

  /// The Unix timestamp (in seconds) for when the batch will expire.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? expiresAt;

  /// The Unix timestamp (in seconds) for when the batch started finalizing.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? finalizingAt;

  /// The Unix timestamp (in seconds) for when the batch was completed.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? completedAt;

  /// The Unix timestamp (in seconds) for when the batch failed.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? failedAt;

  /// The Unix timestamp (in seconds) for when the batch expired.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? expiredAt;

  /// The Unix timestamp (in seconds) for when the batch started cancelling.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? cancellingAt;

  /// The Unix timestamp (in seconds) for when the batch was cancelled.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? cancelledAt;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BatchRequestCounts? requestCounts;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Batch &&
    other.id == id &&
    other.object == object &&
    other.endpoint == endpoint &&
    other.errors == errors &&
    other.inputFileId == inputFileId &&
    other.completionWindow == completionWindow &&
    other.status == status &&
    other.outputFileId == outputFileId &&
    other.errorFileId == errorFileId &&
    other.createdAt == createdAt &&
    other.inProgressAt == inProgressAt &&
    other.expiresAt == expiresAt &&
    other.finalizingAt == finalizingAt &&
    other.completedAt == completedAt &&
    other.failedAt == failedAt &&
    other.expiredAt == expiredAt &&
    other.cancellingAt == cancellingAt &&
    other.cancelledAt == cancelledAt &&
    other.requestCounts == requestCounts &&
    other.metadata == metadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (endpoint.hashCode) +
    (errors == null ? 0 : errors!.hashCode) +
    (inputFileId.hashCode) +
    (completionWindow.hashCode) +
    (status.hashCode) +
    (outputFileId == null ? 0 : outputFileId!.hashCode) +
    (errorFileId == null ? 0 : errorFileId!.hashCode) +
    (createdAt.hashCode) +
    (inProgressAt == null ? 0 : inProgressAt!.hashCode) +
    (expiresAt == null ? 0 : expiresAt!.hashCode) +
    (finalizingAt == null ? 0 : finalizingAt!.hashCode) +
    (completedAt == null ? 0 : completedAt!.hashCode) +
    (failedAt == null ? 0 : failedAt!.hashCode) +
    (expiredAt == null ? 0 : expiredAt!.hashCode) +
    (cancellingAt == null ? 0 : cancellingAt!.hashCode) +
    (cancelledAt == null ? 0 : cancelledAt!.hashCode) +
    (requestCounts == null ? 0 : requestCounts!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode);

  @override
  String toString() => 'Batch[id=$id, object=$object, endpoint=$endpoint, errors=$errors, inputFileId=$inputFileId, completionWindow=$completionWindow, status=$status, outputFileId=$outputFileId, errorFileId=$errorFileId, createdAt=$createdAt, inProgressAt=$inProgressAt, expiresAt=$expiresAt, finalizingAt=$finalizingAt, completedAt=$completedAt, failedAt=$failedAt, expiredAt=$expiredAt, cancellingAt=$cancellingAt, cancelledAt=$cancelledAt, requestCounts=$requestCounts, metadata=$metadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'endpoint'] = this.endpoint;
    if (this.errors != null) {
      json[r'errors'] = this.errors;
    } else {
      json[r'errors'] = null;
    }
      json[r'input_file_id'] = this.inputFileId;
      json[r'completion_window'] = this.completionWindow;
      json[r'status'] = this.status;
    if (this.outputFileId != null) {
      json[r'output_file_id'] = this.outputFileId;
    } else {
      json[r'output_file_id'] = null;
    }
    if (this.errorFileId != null) {
      json[r'error_file_id'] = this.errorFileId;
    } else {
      json[r'error_file_id'] = null;
    }
      json[r'created_at'] = this.createdAt;
    if (this.inProgressAt != null) {
      json[r'in_progress_at'] = this.inProgressAt;
    } else {
      json[r'in_progress_at'] = null;
    }
    if (this.expiresAt != null) {
      json[r'expires_at'] = this.expiresAt;
    } else {
      json[r'expires_at'] = null;
    }
    if (this.finalizingAt != null) {
      json[r'finalizing_at'] = this.finalizingAt;
    } else {
      json[r'finalizing_at'] = null;
    }
    if (this.completedAt != null) {
      json[r'completed_at'] = this.completedAt;
    } else {
      json[r'completed_at'] = null;
    }
    if (this.failedAt != null) {
      json[r'failed_at'] = this.failedAt;
    } else {
      json[r'failed_at'] = null;
    }
    if (this.expiredAt != null) {
      json[r'expired_at'] = this.expiredAt;
    } else {
      json[r'expired_at'] = null;
    }
    if (this.cancellingAt != null) {
      json[r'cancelling_at'] = this.cancellingAt;
    } else {
      json[r'cancelling_at'] = null;
    }
    if (this.cancelledAt != null) {
      json[r'cancelled_at'] = this.cancelledAt;
    } else {
      json[r'cancelled_at'] = null;
    }
    if (this.requestCounts != null) {
      json[r'request_counts'] = this.requestCounts;
    } else {
      json[r'request_counts'] = null;
    }
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
    return json;
  }

  /// Returns a new [Batch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Batch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Batch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Batch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Batch(
        id: mapValueOfType<String>(json, r'id')!,
        object: BatchObjectEnum.fromJson(json[r'object'])!,
        endpoint: mapValueOfType<String>(json, r'endpoint')!,
        errors: BatchErrors.fromJson(json[r'errors']),
        inputFileId: mapValueOfType<String>(json, r'input_file_id')!,
        completionWindow: mapValueOfType<String>(json, r'completion_window')!,
        status: BatchStatusEnum.fromJson(json[r'status'])!,
        outputFileId: mapValueOfType<String>(json, r'output_file_id'),
        errorFileId: mapValueOfType<String>(json, r'error_file_id'),
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        inProgressAt: mapValueOfType<int>(json, r'in_progress_at'),
        expiresAt: mapValueOfType<int>(json, r'expires_at'),
        finalizingAt: mapValueOfType<int>(json, r'finalizing_at'),
        completedAt: mapValueOfType<int>(json, r'completed_at'),
        failedAt: mapValueOfType<int>(json, r'failed_at'),
        expiredAt: mapValueOfType<int>(json, r'expired_at'),
        cancellingAt: mapValueOfType<int>(json, r'cancelling_at'),
        cancelledAt: mapValueOfType<int>(json, r'cancelled_at'),
        requestCounts: BatchRequestCounts.fromJson(json[r'request_counts']),
        metadata: mapValueOfType<Object>(json, r'metadata'),
      );
    }
    return null;
  }

  static List<Batch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Batch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Batch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Batch> mapFromJson(dynamic json) {
    final map = <String, Batch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Batch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Batch-objects as value to a dart map
  static Map<String, List<Batch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Batch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Batch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'endpoint',
    'input_file_id',
    'completion_window',
    'status',
    'created_at',
  };
}

/// The object type, which is always `batch`.
class BatchObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const BatchObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const batch = BatchObjectEnum._(r'batch');

  /// List of all possible values in this [enum][BatchObjectEnum].
  static const values = <BatchObjectEnum>[
    batch,
  ];

  static BatchObjectEnum? fromJson(dynamic value) => BatchObjectEnumTypeTransformer().decode(value);

  static List<BatchObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BatchObjectEnum] to String,
/// and [decode] dynamic data back to [BatchObjectEnum].
class BatchObjectEnumTypeTransformer {
  factory BatchObjectEnumTypeTransformer() => _instance ??= const BatchObjectEnumTypeTransformer._();

  const BatchObjectEnumTypeTransformer._();

  String encode(BatchObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BatchObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BatchObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'batch': return BatchObjectEnum.batch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BatchObjectEnumTypeTransformer] instance.
  static BatchObjectEnumTypeTransformer? _instance;
}


/// The current status of the batch.
class BatchStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const BatchStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const validating = BatchStatusEnum._(r'validating');
  static const failed = BatchStatusEnum._(r'failed');
  static const inProgress = BatchStatusEnum._(r'in_progress');
  static const finalizing = BatchStatusEnum._(r'finalizing');
  static const completed = BatchStatusEnum._(r'completed');
  static const expired = BatchStatusEnum._(r'expired');
  static const cancelling = BatchStatusEnum._(r'cancelling');
  static const cancelled = BatchStatusEnum._(r'cancelled');

  /// List of all possible values in this [enum][BatchStatusEnum].
  static const values = <BatchStatusEnum>[
    validating,
    failed,
    inProgress,
    finalizing,
    completed,
    expired,
    cancelling,
    cancelled,
  ];

  static BatchStatusEnum? fromJson(dynamic value) => BatchStatusEnumTypeTransformer().decode(value);

  static List<BatchStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BatchStatusEnum] to String,
/// and [decode] dynamic data back to [BatchStatusEnum].
class BatchStatusEnumTypeTransformer {
  factory BatchStatusEnumTypeTransformer() => _instance ??= const BatchStatusEnumTypeTransformer._();

  const BatchStatusEnumTypeTransformer._();

  String encode(BatchStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BatchStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BatchStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'validating': return BatchStatusEnum.validating;
        case r'failed': return BatchStatusEnum.failed;
        case r'in_progress': return BatchStatusEnum.inProgress;
        case r'finalizing': return BatchStatusEnum.finalizing;
        case r'completed': return BatchStatusEnum.completed;
        case r'expired': return BatchStatusEnum.expired;
        case r'cancelling': return BatchStatusEnum.cancelling;
        case r'cancelled': return BatchStatusEnum.cancelled;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BatchStatusEnumTypeTransformer] instance.
  static BatchStatusEnumTypeTransformer? _instance;
}


