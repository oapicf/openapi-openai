//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ThreadObject {
  /// Returns a new [ThreadObject] instance.
  ThreadObject({
    required this.id,
    required this.object,
    required this.createdAt,
    required this.toolResources,
    required this.metadata,
  });

  /// The identifier, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `thread`.
  ThreadObjectObjectEnum object;

  /// The Unix timestamp (in seconds) for when the thread was created.
  int createdAt;

  ModifyThreadRequestToolResources? toolResources;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ThreadObject &&
    other.id == id &&
    other.object == object &&
    other.createdAt == createdAt &&
    other.toolResources == toolResources &&
    other.metadata == metadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (createdAt.hashCode) +
    (toolResources == null ? 0 : toolResources!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode);

  @override
  String toString() => 'ThreadObject[id=$id, object=$object, createdAt=$createdAt, toolResources=$toolResources, metadata=$metadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'created_at'] = this.createdAt;
    if (this.toolResources != null) {
      json[r'tool_resources'] = this.toolResources;
    } else {
      json[r'tool_resources'] = null;
    }
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
    return json;
  }

  /// Returns a new [ThreadObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ThreadObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ThreadObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ThreadObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ThreadObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: ThreadObjectObjectEnum.fromJson(json[r'object'])!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        toolResources: ModifyThreadRequestToolResources.fromJson(json[r'tool_resources']),
        metadata: mapValueOfType<Object>(json, r'metadata'),
      );
    }
    return null;
  }

  static List<ThreadObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ThreadObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ThreadObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ThreadObject> mapFromJson(dynamic json) {
    final map = <String, ThreadObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ThreadObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ThreadObject-objects as value to a dart map
  static Map<String, List<ThreadObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ThreadObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ThreadObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'created_at',
    'tool_resources',
    'metadata',
  };
}

/// The object type, which is always `thread`.
class ThreadObjectObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ThreadObjectObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const thread = ThreadObjectObjectEnum._(r'thread');

  /// List of all possible values in this [enum][ThreadObjectObjectEnum].
  static const values = <ThreadObjectObjectEnum>[
    thread,
  ];

  static ThreadObjectObjectEnum? fromJson(dynamic value) => ThreadObjectObjectEnumTypeTransformer().decode(value);

  static List<ThreadObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ThreadObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ThreadObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ThreadObjectObjectEnum] to String,
/// and [decode] dynamic data back to [ThreadObjectObjectEnum].
class ThreadObjectObjectEnumTypeTransformer {
  factory ThreadObjectObjectEnumTypeTransformer() => _instance ??= const ThreadObjectObjectEnumTypeTransformer._();

  const ThreadObjectObjectEnumTypeTransformer._();

  String encode(ThreadObjectObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ThreadObjectObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ThreadObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread': return ThreadObjectObjectEnum.thread;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ThreadObjectObjectEnumTypeTransformer] instance.
  static ThreadObjectObjectEnumTypeTransformer? _instance;
}


