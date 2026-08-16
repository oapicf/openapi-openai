//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class User {
  /// Returns a new [User] instance.
  User({
    required this.object,
    required this.id,
    required this.name,
    required this.email,
    required this.role,
    required this.addedAt,
  });

  /// The object type, which is always `organization.user`
  UserObjectEnum object;

  /// The identifier, which can be referenced in API endpoints
  String id;

  /// The name of the user
  String name;

  /// The email address of the user
  String email;

  /// `owner` or `reader`
  UserRoleEnum role;

  /// The Unix timestamp (in seconds) of when the user was added.
  int addedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is User &&
    other.object == object &&
    other.id == id &&
    other.name == name &&
    other.email == email &&
    other.role == role &&
    other.addedAt == addedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (name.hashCode) +
    (email.hashCode) +
    (role.hashCode) +
    (addedAt.hashCode);

  @override
  String toString() => 'User[object=$object, id=$id, name=$name, email=$email, role=$role, addedAt=$addedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'email'] = this.email;
      json[r'role'] = this.role;
      json[r'added_at'] = this.addedAt;
    return json;
  }

  /// Returns a new [User] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static User? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "User[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "User[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return User(
        object: UserObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        email: mapValueOfType<String>(json, r'email')!,
        role: UserRoleEnum.fromJson(json[r'role'])!,
        addedAt: mapValueOfType<int>(json, r'added_at')!,
      );
    }
    return null;
  }

  static List<User> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <User>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = User.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, User> mapFromJson(dynamic json) {
    final map = <String, User>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = User.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of User-objects as value to a dart map
  static Map<String, List<User>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<User>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = User.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'name',
    'email',
    'role',
    'added_at',
  };
}

/// The object type, which is always `organization.user`
class UserObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UserObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodUser = UserObjectEnum._(r'organization.user');

  /// List of all possible values in this [enum][UserObjectEnum].
  static const values = <UserObjectEnum>[
    organizationPeriodUser,
  ];

  static UserObjectEnum? fromJson(dynamic value) => UserObjectEnumTypeTransformer().decode(value);

  static List<UserObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserObjectEnum] to String,
/// and [decode] dynamic data back to [UserObjectEnum].
class UserObjectEnumTypeTransformer {
  factory UserObjectEnumTypeTransformer() => _instance ??= const UserObjectEnumTypeTransformer._();

  const UserObjectEnumTypeTransformer._();

  String encode(UserObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UserObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.user': return UserObjectEnum.organizationPeriodUser;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UserObjectEnumTypeTransformer] instance.
  static UserObjectEnumTypeTransformer? _instance;
}


/// `owner` or `reader`
class UserRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const UserRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const owner = UserRoleEnum._(r'owner');
  static const reader = UserRoleEnum._(r'reader');

  /// List of all possible values in this [enum][UserRoleEnum].
  static const values = <UserRoleEnum>[
    owner,
    reader,
  ];

  static UserRoleEnum? fromJson(dynamic value) => UserRoleEnumTypeTransformer().decode(value);

  static List<UserRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserRoleEnum] to String,
/// and [decode] dynamic data back to [UserRoleEnum].
class UserRoleEnumTypeTransformer {
  factory UserRoleEnumTypeTransformer() => _instance ??= const UserRoleEnumTypeTransformer._();

  const UserRoleEnumTypeTransformer._();

  String encode(UserRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UserRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'owner': return UserRoleEnum.owner;
        case r'reader': return UserRoleEnum.reader;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UserRoleEnumTypeTransformer] instance.
  static UserRoleEnumTypeTransformer? _instance;
}


