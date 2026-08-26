//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VectorStoreFileBatchObject {
  /// Returns a new [VectorStoreFileBatchObject] instance.
  VectorStoreFileBatchObject({
    required this.id,
    required this.object,
    required this.createdAt,
    required this.vectorStoreId,
    required this.status,
    required this.fileCounts,
  });

  /// The identifier, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `vector_store.file_batch`.
  VectorStoreFileBatchObjectObjectEnum object;

  /// The Unix timestamp (in seconds) for when the vector store files batch was created.
  int createdAt;

  /// The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  String vectorStoreId;

  /// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  VectorStoreFileBatchObjectStatusEnum status;

  VectorStoreFileBatchObjectFileCounts fileCounts;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VectorStoreFileBatchObject &&
    other.id == id &&
    other.object == object &&
    other.createdAt == createdAt &&
    other.vectorStoreId == vectorStoreId &&
    other.status == status &&
    other.fileCounts == fileCounts;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (createdAt.hashCode) +
    (vectorStoreId.hashCode) +
    (status.hashCode) +
    (fileCounts.hashCode);

  @override
  String toString() => 'VectorStoreFileBatchObject[id=$id, object=$object, createdAt=$createdAt, vectorStoreId=$vectorStoreId, status=$status, fileCounts=$fileCounts]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'created_at'] = this.createdAt;
      json[r'vector_store_id'] = this.vectorStoreId;
      json[r'status'] = this.status;
      json[r'file_counts'] = this.fileCounts;
    return json;
  }

  /// Returns a new [VectorStoreFileBatchObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VectorStoreFileBatchObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "VectorStoreFileBatchObject[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "VectorStoreFileBatchObject[id]" has a null value in JSON.');
        assert(json.containsKey(r'object'), 'Required key "VectorStoreFileBatchObject[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "VectorStoreFileBatchObject[object]" has a null value in JSON.');
        assert(json.containsKey(r'created_at'), 'Required key "VectorStoreFileBatchObject[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "VectorStoreFileBatchObject[created_at]" has a null value in JSON.');
        assert(json.containsKey(r'vector_store_id'), 'Required key "VectorStoreFileBatchObject[vector_store_id]" is missing from JSON.');
        assert(json[r'vector_store_id'] != null, 'Required key "VectorStoreFileBatchObject[vector_store_id]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "VectorStoreFileBatchObject[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "VectorStoreFileBatchObject[status]" has a null value in JSON.');
        assert(json.containsKey(r'file_counts'), 'Required key "VectorStoreFileBatchObject[file_counts]" is missing from JSON.');
        assert(json[r'file_counts'] != null, 'Required key "VectorStoreFileBatchObject[file_counts]" has a null value in JSON.');
        return true;
      }());

      return VectorStoreFileBatchObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: VectorStoreFileBatchObjectObjectEnum.fromJson(json[r'object'])!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        vectorStoreId: mapValueOfType<String>(json, r'vector_store_id')!,
        status: VectorStoreFileBatchObjectStatusEnum.fromJson(json[r'status'])!,
        fileCounts: VectorStoreFileBatchObjectFileCounts.fromJson(json[r'file_counts'])!,
      );
    }
    return null;
  }

  static List<VectorStoreFileBatchObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileBatchObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileBatchObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VectorStoreFileBatchObject> mapFromJson(dynamic json) {
    final map = <String, VectorStoreFileBatchObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VectorStoreFileBatchObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VectorStoreFileBatchObject-objects as value to a dart map
  static Map<String, List<VectorStoreFileBatchObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VectorStoreFileBatchObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VectorStoreFileBatchObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'created_at',
    'vector_store_id',
    'status',
    'file_counts',
  };
}

/// The object type, which is always `vector_store.file_batch`.
enum VectorStoreFileBatchObjectObjectEnum {
  vectorStorePeriodFilesBatch._(r'vector_store.files_batch'),
  ;

  /// Instantiate a new enum with the provided value.
  const VectorStoreFileBatchObjectObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [VectorStoreFileBatchObjectObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static VectorStoreFileBatchObjectObjectEnum? fromJson(dynamic value) => VectorStoreFileBatchObjectObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [VectorStoreFileBatchObjectObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<VectorStoreFileBatchObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileBatchObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileBatchObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreFileBatchObjectObjectEnum] to String,
/// and [decode] dynamic data back to [VectorStoreFileBatchObjectObjectEnum].
class VectorStoreFileBatchObjectObjectEnumTypeTransformer {
  factory VectorStoreFileBatchObjectObjectEnumTypeTransformer() => _instance ??= const VectorStoreFileBatchObjectObjectEnumTypeTransformer._();

  const VectorStoreFileBatchObjectObjectEnumTypeTransformer._();

  String encode(VectorStoreFileBatchObjectObjectEnum data) => data._value;

  /// Returns the instance of [VectorStoreFileBatchObjectObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreFileBatchObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is VectorStoreFileBatchObjectObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'vector_store.files_batch': return VectorStoreFileBatchObjectObjectEnum.vectorStorePeriodFilesBatch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static VectorStoreFileBatchObjectObjectEnumTypeTransformer? _instance;
}


/// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
enum VectorStoreFileBatchObjectStatusEnum {
  inProgress._(r'in_progress'),
  completed._(r'completed'),
  cancelled._(r'cancelled'),
  failed._(r'failed'),
  ;

  /// Instantiate a new enum with the provided value.
  const VectorStoreFileBatchObjectStatusEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [VectorStoreFileBatchObjectStatusEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static VectorStoreFileBatchObjectStatusEnum? fromJson(dynamic value) => VectorStoreFileBatchObjectStatusEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [VectorStoreFileBatchObjectStatusEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<VectorStoreFileBatchObjectStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileBatchObjectStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileBatchObjectStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreFileBatchObjectStatusEnum] to String,
/// and [decode] dynamic data back to [VectorStoreFileBatchObjectStatusEnum].
class VectorStoreFileBatchObjectStatusEnumTypeTransformer {
  factory VectorStoreFileBatchObjectStatusEnumTypeTransformer() => _instance ??= const VectorStoreFileBatchObjectStatusEnumTypeTransformer._();

  const VectorStoreFileBatchObjectStatusEnumTypeTransformer._();

  String encode(VectorStoreFileBatchObjectStatusEnum data) => data._value;

  /// Returns the instance of [VectorStoreFileBatchObjectStatusEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreFileBatchObjectStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is VectorStoreFileBatchObjectStatusEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'in_progress': return VectorStoreFileBatchObjectStatusEnum.inProgress;
        case r'completed': return VectorStoreFileBatchObjectStatusEnum.completed;
        case r'cancelled': return VectorStoreFileBatchObjectStatusEnum.cancelled;
        case r'failed': return VectorStoreFileBatchObjectStatusEnum.failed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static VectorStoreFileBatchObjectStatusEnumTypeTransformer? _instance;
}


