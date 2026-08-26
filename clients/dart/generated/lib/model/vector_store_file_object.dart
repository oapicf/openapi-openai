//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VectorStoreFileObject {
  /// Returns a new [VectorStoreFileObject] instance.
  VectorStoreFileObject({
    required this.id,
    required this.object,
    required this.usageBytes,
    required this.createdAt,
    required this.vectorStoreId,
    required this.status,
    required this.lastError,
    this.chunkingStrategy,
  });

  /// The identifier, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `vector_store.file`.
  VectorStoreFileObjectObjectEnum object;

  /// The total vector store usage in bytes. Note that this may be different from the original file size.
  int usageBytes;

  /// The Unix timestamp (in seconds) for when the vector store file was created.
  int createdAt;

  /// The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  String vectorStoreId;

  /// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  VectorStoreFileObjectStatusEnum status;

  VectorStoreFileObjectLastError? lastError;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  VectorStoreFileObjectChunkingStrategy? chunkingStrategy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VectorStoreFileObject &&
    other.id == id &&
    other.object == object &&
    other.usageBytes == usageBytes &&
    other.createdAt == createdAt &&
    other.vectorStoreId == vectorStoreId &&
    other.status == status &&
    other.lastError == lastError &&
    other.chunkingStrategy == chunkingStrategy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (usageBytes.hashCode) +
    (createdAt.hashCode) +
    (vectorStoreId.hashCode) +
    (status.hashCode) +
    (lastError == null ? 0 : lastError!.hashCode) +
    (chunkingStrategy == null ? 0 : chunkingStrategy!.hashCode);

  @override
  String toString() => 'VectorStoreFileObject[id=$id, object=$object, usageBytes=$usageBytes, createdAt=$createdAt, vectorStoreId=$vectorStoreId, status=$status, lastError=$lastError, chunkingStrategy=$chunkingStrategy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'usage_bytes'] = this.usageBytes;
      json[r'created_at'] = this.createdAt;
      json[r'vector_store_id'] = this.vectorStoreId;
      json[r'status'] = this.status;
    if (this.lastError != null) {
      json[r'last_error'] = this.lastError;
    } else {
      json[r'last_error'] = null;
    }
    if (this.chunkingStrategy != null) {
      json[r'chunking_strategy'] = this.chunkingStrategy;
    } else {
      json[r'chunking_strategy'] = null;
    }
    return json;
  }

  /// Returns a new [VectorStoreFileObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VectorStoreFileObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "VectorStoreFileObject[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "VectorStoreFileObject[id]" has a null value in JSON.');
        assert(json.containsKey(r'object'), 'Required key "VectorStoreFileObject[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "VectorStoreFileObject[object]" has a null value in JSON.');
        assert(json.containsKey(r'usage_bytes'), 'Required key "VectorStoreFileObject[usage_bytes]" is missing from JSON.');
        assert(json[r'usage_bytes'] != null, 'Required key "VectorStoreFileObject[usage_bytes]" has a null value in JSON.');
        assert(json.containsKey(r'created_at'), 'Required key "VectorStoreFileObject[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "VectorStoreFileObject[created_at]" has a null value in JSON.');
        assert(json.containsKey(r'vector_store_id'), 'Required key "VectorStoreFileObject[vector_store_id]" is missing from JSON.');
        assert(json[r'vector_store_id'] != null, 'Required key "VectorStoreFileObject[vector_store_id]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "VectorStoreFileObject[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "VectorStoreFileObject[status]" has a null value in JSON.');
        assert(json.containsKey(r'last_error'), 'Required key "VectorStoreFileObject[last_error]" is missing from JSON.');
        return true;
      }());

      return VectorStoreFileObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: VectorStoreFileObjectObjectEnum.fromJson(json[r'object'])!,
        usageBytes: mapValueOfType<int>(json, r'usage_bytes')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        vectorStoreId: mapValueOfType<String>(json, r'vector_store_id')!,
        status: VectorStoreFileObjectStatusEnum.fromJson(json[r'status'])!,
        lastError: VectorStoreFileObjectLastError.fromJson(json[r'last_error']),
        chunkingStrategy: VectorStoreFileObjectChunkingStrategy.fromJson(json[r'chunking_strategy']),
      );
    }
    return null;
  }

  static List<VectorStoreFileObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VectorStoreFileObject> mapFromJson(dynamic json) {
    final map = <String, VectorStoreFileObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VectorStoreFileObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VectorStoreFileObject-objects as value to a dart map
  static Map<String, List<VectorStoreFileObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VectorStoreFileObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VectorStoreFileObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'usage_bytes',
    'created_at',
    'vector_store_id',
    'status',
    'last_error',
  };
}

/// The object type, which is always `vector_store.file`.
enum VectorStoreFileObjectObjectEnum {
  vectorStorePeriodFile._(r'vector_store.file'),
  ;

  /// Instantiate a new enum with the provided value.
  const VectorStoreFileObjectObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [VectorStoreFileObjectObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static VectorStoreFileObjectObjectEnum? fromJson(dynamic value) => VectorStoreFileObjectObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [VectorStoreFileObjectObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<VectorStoreFileObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreFileObjectObjectEnum] to String,
/// and [decode] dynamic data back to [VectorStoreFileObjectObjectEnum].
class VectorStoreFileObjectObjectEnumTypeTransformer {
  factory VectorStoreFileObjectObjectEnumTypeTransformer() => _instance ??= const VectorStoreFileObjectObjectEnumTypeTransformer._();

  const VectorStoreFileObjectObjectEnumTypeTransformer._();

  String encode(VectorStoreFileObjectObjectEnum data) => data._value;

  /// Returns the instance of [VectorStoreFileObjectObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreFileObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is VectorStoreFileObjectObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'vector_store.file': return VectorStoreFileObjectObjectEnum.vectorStorePeriodFile;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static VectorStoreFileObjectObjectEnumTypeTransformer? _instance;
}


/// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
enum VectorStoreFileObjectStatusEnum {
  inProgress._(r'in_progress'),
  completed._(r'completed'),
  cancelled._(r'cancelled'),
  failed._(r'failed'),
  ;

  /// Instantiate a new enum with the provided value.
  const VectorStoreFileObjectStatusEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [VectorStoreFileObjectStatusEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static VectorStoreFileObjectStatusEnum? fromJson(dynamic value) => VectorStoreFileObjectStatusEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [VectorStoreFileObjectStatusEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<VectorStoreFileObjectStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileObjectStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileObjectStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreFileObjectStatusEnum] to String,
/// and [decode] dynamic data back to [VectorStoreFileObjectStatusEnum].
class VectorStoreFileObjectStatusEnumTypeTransformer {
  factory VectorStoreFileObjectStatusEnumTypeTransformer() => _instance ??= const VectorStoreFileObjectStatusEnumTypeTransformer._();

  const VectorStoreFileObjectStatusEnumTypeTransformer._();

  String encode(VectorStoreFileObjectStatusEnum data) => data._value;

  /// Returns the instance of [VectorStoreFileObjectStatusEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreFileObjectStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is VectorStoreFileObjectStatusEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'in_progress': return VectorStoreFileObjectStatusEnum.inProgress;
        case r'completed': return VectorStoreFileObjectStatusEnum.completed;
        case r'cancelled': return VectorStoreFileObjectStatusEnum.cancelled;
        case r'failed': return VectorStoreFileObjectStatusEnum.failed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static VectorStoreFileObjectStatusEnumTypeTransformer? _instance;
}


