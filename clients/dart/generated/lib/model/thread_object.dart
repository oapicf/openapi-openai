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
        assert(json.containsKey(r'id'), 'Required key "ThreadObject[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ThreadObject[id]" has a null value in JSON.');
        assert(json.containsKey(r'object'), 'Required key "ThreadObject[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "ThreadObject[object]" has a null value in JSON.');
        assert(json.containsKey(r'created_at'), 'Required key "ThreadObject[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "ThreadObject[created_at]" has a null value in JSON.');
        assert(json.containsKey(r'tool_resources'), 'Required key "ThreadObject[tool_resources]" is missing from JSON.');
        assert(json.containsKey(r'metadata'), 'Required key "ThreadObject[metadata]" is missing from JSON.');
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
enum ThreadObjectObjectEnum {
  thread._(r'thread'),
  ;

  /// Instantiate a new enum with the provided value.
  const ThreadObjectObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ThreadObjectObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ThreadObjectObjectEnum? fromJson(dynamic value) => ThreadObjectObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ThreadObjectObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(ThreadObjectObjectEnum data) => data._value;

  /// Returns the instance of [ThreadObjectObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ThreadObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ThreadObjectObjectEnum) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static ThreadObjectObjectEnumTypeTransformer? _instance;
}


