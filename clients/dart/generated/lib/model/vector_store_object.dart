//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VectorStoreObject {
  /// Returns a new [VectorStoreObject] instance.
  VectorStoreObject({
    required this.id,
    required this.object,
    required this.createdAt,
    required this.name,
    required this.usageBytes,
    required this.fileCounts,
    required this.status,
    this.expiresAfter,
    this.expiresAt,
    required this.lastActiveAt,
    required this.metadata,
  });

  /// The identifier, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `vector_store`.
  VectorStoreObjectObjectEnum object;

  /// The Unix timestamp (in seconds) for when the vector store was created.
  int createdAt;

  /// The name of the vector store.
  String name;

  /// The total number of bytes used by the files in the vector store.
  int usageBytes;

  VectorStoreObjectFileCounts fileCounts;

  /// The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  VectorStoreObjectStatusEnum status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  VectorStoreExpirationAfter? expiresAfter;

  /// The Unix timestamp (in seconds) for when the vector store will expire.
  int? expiresAt;

  /// The Unix timestamp (in seconds) for when the vector store was last active.
  int? lastActiveAt;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VectorStoreObject &&
    other.id == id &&
    other.object == object &&
    other.createdAt == createdAt &&
    other.name == name &&
    other.usageBytes == usageBytes &&
    other.fileCounts == fileCounts &&
    other.status == status &&
    other.expiresAfter == expiresAfter &&
    other.expiresAt == expiresAt &&
    other.lastActiveAt == lastActiveAt &&
    other.metadata == metadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (createdAt.hashCode) +
    (name.hashCode) +
    (usageBytes.hashCode) +
    (fileCounts.hashCode) +
    (status.hashCode) +
    (expiresAfter == null ? 0 : expiresAfter!.hashCode) +
    (expiresAt == null ? 0 : expiresAt!.hashCode) +
    (lastActiveAt == null ? 0 : lastActiveAt!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode);

  @override
  String toString() => 'VectorStoreObject[id=$id, object=$object, createdAt=$createdAt, name=$name, usageBytes=$usageBytes, fileCounts=$fileCounts, status=$status, expiresAfter=$expiresAfter, expiresAt=$expiresAt, lastActiveAt=$lastActiveAt, metadata=$metadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'created_at'] = this.createdAt;
      json[r'name'] = this.name;
      json[r'usage_bytes'] = this.usageBytes;
      json[r'file_counts'] = this.fileCounts;
      json[r'status'] = this.status;
    if (this.expiresAfter != null) {
      json[r'expires_after'] = this.expiresAfter;
    } else {
      json[r'expires_after'] = null;
    }
    if (this.expiresAt != null) {
      json[r'expires_at'] = this.expiresAt;
    } else {
      json[r'expires_at'] = null;
    }
    if (this.lastActiveAt != null) {
      json[r'last_active_at'] = this.lastActiveAt;
    } else {
      json[r'last_active_at'] = null;
    }
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
    return json;
  }

  /// Returns a new [VectorStoreObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VectorStoreObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "VectorStoreObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "VectorStoreObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return VectorStoreObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: VectorStoreObjectObjectEnum.fromJson(json[r'object'])!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        name: mapValueOfType<String>(json, r'name')!,
        usageBytes: mapValueOfType<int>(json, r'usage_bytes')!,
        fileCounts: VectorStoreObjectFileCounts.fromJson(json[r'file_counts'])!,
        status: VectorStoreObjectStatusEnum.fromJson(json[r'status'])!,
        expiresAfter: VectorStoreExpirationAfter.fromJson(json[r'expires_after']),
        expiresAt: mapValueOfType<int>(json, r'expires_at'),
        lastActiveAt: mapValueOfType<int>(json, r'last_active_at'),
        metadata: mapValueOfType<Object>(json, r'metadata'),
      );
    }
    return null;
  }

  static List<VectorStoreObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VectorStoreObject> mapFromJson(dynamic json) {
    final map = <String, VectorStoreObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VectorStoreObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VectorStoreObject-objects as value to a dart map
  static Map<String, List<VectorStoreObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VectorStoreObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VectorStoreObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'created_at',
    'name',
    'usage_bytes',
    'file_counts',
    'status',
    'last_active_at',
    'metadata',
  };
}

/// The object type, which is always `vector_store`.
class VectorStoreObjectObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const VectorStoreObjectObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const vectorStore = VectorStoreObjectObjectEnum._(r'vector_store');

  /// List of all possible values in this [enum][VectorStoreObjectObjectEnum].
  static const values = <VectorStoreObjectObjectEnum>[
    vectorStore,
  ];

  static VectorStoreObjectObjectEnum? fromJson(dynamic value) => VectorStoreObjectObjectEnumTypeTransformer().decode(value);

  static List<VectorStoreObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreObjectObjectEnum] to String,
/// and [decode] dynamic data back to [VectorStoreObjectObjectEnum].
class VectorStoreObjectObjectEnumTypeTransformer {
  factory VectorStoreObjectObjectEnumTypeTransformer() => _instance ??= const VectorStoreObjectObjectEnumTypeTransformer._();

  const VectorStoreObjectObjectEnumTypeTransformer._();

  String encode(VectorStoreObjectObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a VectorStoreObjectObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'vector_store': return VectorStoreObjectObjectEnum.vectorStore;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [VectorStoreObjectObjectEnumTypeTransformer] instance.
  static VectorStoreObjectObjectEnumTypeTransformer? _instance;
}


/// The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
class VectorStoreObjectStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const VectorStoreObjectStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const expired = VectorStoreObjectStatusEnum._(r'expired');
  static const inProgress = VectorStoreObjectStatusEnum._(r'in_progress');
  static const completed = VectorStoreObjectStatusEnum._(r'completed');

  /// List of all possible values in this [enum][VectorStoreObjectStatusEnum].
  static const values = <VectorStoreObjectStatusEnum>[
    expired,
    inProgress,
    completed,
  ];

  static VectorStoreObjectStatusEnum? fromJson(dynamic value) => VectorStoreObjectStatusEnumTypeTransformer().decode(value);

  static List<VectorStoreObjectStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreObjectStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreObjectStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreObjectStatusEnum] to String,
/// and [decode] dynamic data back to [VectorStoreObjectStatusEnum].
class VectorStoreObjectStatusEnumTypeTransformer {
  factory VectorStoreObjectStatusEnumTypeTransformer() => _instance ??= const VectorStoreObjectStatusEnumTypeTransformer._();

  const VectorStoreObjectStatusEnumTypeTransformer._();

  String encode(VectorStoreObjectStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a VectorStoreObjectStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreObjectStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'expired': return VectorStoreObjectStatusEnum.expired;
        case r'in_progress': return VectorStoreObjectStatusEnum.inProgress;
        case r'completed': return VectorStoreObjectStatusEnum.completed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [VectorStoreObjectStatusEnumTypeTransformer] instance.
  static VectorStoreObjectStatusEnumTypeTransformer? _instance;
}


