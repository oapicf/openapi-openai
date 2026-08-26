//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageVectorStoresResult {
  /// Returns a new [UsageVectorStoresResult] instance.
  UsageVectorStoresResult({
    required this.object,
    required this.usageBytes,
    this.projectId,
  });

  UsageVectorStoresResultObjectEnum object;

  /// The vector stores usage in bytes.
  int usageBytes;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  String? projectId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageVectorStoresResult &&
    other.object == object &&
    other.usageBytes == usageBytes &&
    other.projectId == projectId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (usageBytes.hashCode) +
    (projectId == null ? 0 : projectId!.hashCode);

  @override
  String toString() => 'UsageVectorStoresResult[object=$object, usageBytes=$usageBytes, projectId=$projectId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'usage_bytes'] = this.usageBytes;
    if (this.projectId != null) {
      json[r'project_id'] = this.projectId;
    } else {
      json[r'project_id'] = null;
    }
    return json;
  }

  /// Returns a new [UsageVectorStoresResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageVectorStoresResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'object'), 'Required key "UsageVectorStoresResult[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "UsageVectorStoresResult[object]" has a null value in JSON.');
        assert(json.containsKey(r'usage_bytes'), 'Required key "UsageVectorStoresResult[usage_bytes]" is missing from JSON.');
        assert(json[r'usage_bytes'] != null, 'Required key "UsageVectorStoresResult[usage_bytes]" has a null value in JSON.');
        return true;
      }());

      return UsageVectorStoresResult(
        object: UsageVectorStoresResultObjectEnum.fromJson(json[r'object'])!,
        usageBytes: mapValueOfType<int>(json, r'usage_bytes')!,
        projectId: mapValueOfType<String>(json, r'project_id'),
      );
    }
    return null;
  }

  static List<UsageVectorStoresResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageVectorStoresResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageVectorStoresResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageVectorStoresResult> mapFromJson(dynamic json) {
    final map = <String, UsageVectorStoresResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageVectorStoresResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageVectorStoresResult-objects as value to a dart map
  static Map<String, List<UsageVectorStoresResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageVectorStoresResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageVectorStoresResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'usage_bytes',
  };
}


enum UsageVectorStoresResultObjectEnum {
  organizationPeriodUsagePeriodVectorStoresPeriodResult._(r'organization.usage.vector_stores.result'),
  ;

  /// Instantiate a new enum with the provided value.
  const UsageVectorStoresResultObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UsageVectorStoresResultObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UsageVectorStoresResultObjectEnum? fromJson(dynamic value) => UsageVectorStoresResultObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UsageVectorStoresResultObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<UsageVectorStoresResultObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageVectorStoresResultObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageVectorStoresResultObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageVectorStoresResultObjectEnum] to String,
/// and [decode] dynamic data back to [UsageVectorStoresResultObjectEnum].
class UsageVectorStoresResultObjectEnumTypeTransformer {
  factory UsageVectorStoresResultObjectEnumTypeTransformer() => _instance ??= const UsageVectorStoresResultObjectEnumTypeTransformer._();

  const UsageVectorStoresResultObjectEnumTypeTransformer._();

  String encode(UsageVectorStoresResultObjectEnum data) => data._value;

  /// Returns the instance of [UsageVectorStoresResultObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageVectorStoresResultObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is UsageVectorStoresResultObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'organization.usage.vector_stores.result': return UsageVectorStoresResultObjectEnum.organizationPeriodUsagePeriodVectorStoresPeriodResult;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static UsageVectorStoresResultObjectEnumTypeTransformer? _instance;
}


