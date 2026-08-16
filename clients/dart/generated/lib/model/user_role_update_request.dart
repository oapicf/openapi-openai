//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserRoleUpdateRequest {
  /// Returns a new [UserRoleUpdateRequest] instance.
  UserRoleUpdateRequest({
    required this.role,
  });

  /// `owner` or `reader`
  UserRoleUpdateRequestRoleEnum role;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserRoleUpdateRequest &&
    other.role == role;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (role.hashCode);

  @override
  String toString() => 'UserRoleUpdateRequest[role=$role]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'role'] = this.role;
    return json;
  }

  /// Returns a new [UserRoleUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserRoleUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserRoleUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserRoleUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserRoleUpdateRequest(
        role: UserRoleUpdateRequestRoleEnum.fromJson(json[r'role'])!,
      );
    }
    return null;
  }

  static List<UserRoleUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserRoleUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserRoleUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserRoleUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, UserRoleUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserRoleUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserRoleUpdateRequest-objects as value to a dart map
  static Map<String, List<UserRoleUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserRoleUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserRoleUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'role',
  };
}

/// `owner` or `reader`
class UserRoleUpdateRequestRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const UserRoleUpdateRequestRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const owner = UserRoleUpdateRequestRoleEnum._(r'owner');
  static const reader = UserRoleUpdateRequestRoleEnum._(r'reader');

  /// List of all possible values in this [enum][UserRoleUpdateRequestRoleEnum].
  static const values = <UserRoleUpdateRequestRoleEnum>[
    owner,
    reader,
  ];

  static UserRoleUpdateRequestRoleEnum? fromJson(dynamic value) => UserRoleUpdateRequestRoleEnumTypeTransformer().decode(value);

  static List<UserRoleUpdateRequestRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserRoleUpdateRequestRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserRoleUpdateRequestRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserRoleUpdateRequestRoleEnum] to String,
/// and [decode] dynamic data back to [UserRoleUpdateRequestRoleEnum].
class UserRoleUpdateRequestRoleEnumTypeTransformer {
  factory UserRoleUpdateRequestRoleEnumTypeTransformer() => _instance ??= const UserRoleUpdateRequestRoleEnumTypeTransformer._();

  const UserRoleUpdateRequestRoleEnumTypeTransformer._();

  String encode(UserRoleUpdateRequestRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UserRoleUpdateRequestRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserRoleUpdateRequestRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'owner': return UserRoleUpdateRequestRoleEnum.owner;
        case r'reader': return UserRoleUpdateRequestRoleEnum.reader;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UserRoleUpdateRequestRoleEnumTypeTransformer] instance.
  static UserRoleUpdateRequestRoleEnumTypeTransformer? _instance;
}


