//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserDeleteResponse {
  /// Returns a new [UserDeleteResponse] instance.
  UserDeleteResponse({
    required this.object,
    required this.id,
    required this.deleted,
  });

  UserDeleteResponseObjectEnum object;

  String id;

  bool deleted;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserDeleteResponse &&
    other.object == object &&
    other.id == id &&
    other.deleted == deleted;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (deleted.hashCode);

  @override
  String toString() => 'UserDeleteResponse[object=$object, id=$id, deleted=$deleted]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
    return json;
  }

  /// Returns a new [UserDeleteResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserDeleteResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserDeleteResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserDeleteResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserDeleteResponse(
        object: UserDeleteResponseObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
      );
    }
    return null;
  }

  static List<UserDeleteResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserDeleteResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserDeleteResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserDeleteResponse> mapFromJson(dynamic json) {
    final map = <String, UserDeleteResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserDeleteResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserDeleteResponse-objects as value to a dart map
  static Map<String, List<UserDeleteResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserDeleteResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserDeleteResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'deleted',
  };
}


class UserDeleteResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UserDeleteResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodUserPeriodDeleted = UserDeleteResponseObjectEnum._(r'organization.user.deleted');

  /// List of all possible values in this [enum][UserDeleteResponseObjectEnum].
  static const values = <UserDeleteResponseObjectEnum>[
    organizationPeriodUserPeriodDeleted,
  ];

  static UserDeleteResponseObjectEnum? fromJson(dynamic value) => UserDeleteResponseObjectEnumTypeTransformer().decode(value);

  static List<UserDeleteResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserDeleteResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserDeleteResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserDeleteResponseObjectEnum] to String,
/// and [decode] dynamic data back to [UserDeleteResponseObjectEnum].
class UserDeleteResponseObjectEnumTypeTransformer {
  factory UserDeleteResponseObjectEnumTypeTransformer() => _instance ??= const UserDeleteResponseObjectEnumTypeTransformer._();

  const UserDeleteResponseObjectEnumTypeTransformer._();

  String encode(UserDeleteResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UserDeleteResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserDeleteResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.user.deleted': return UserDeleteResponseObjectEnum.organizationPeriodUserPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UserDeleteResponseObjectEnumTypeTransformer] instance.
  static UserDeleteResponseObjectEnumTypeTransformer? _instance;
}


