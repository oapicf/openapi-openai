//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserListResponse {
  /// Returns a new [UserListResponse] instance.
  UserListResponse({
    required this.object,
    this.data = const [],
    required this.firstId,
    required this.lastId,
    required this.hasMore,
  });

  UserListResponseObjectEnum object;

  List<User> data;

  String firstId;

  String lastId;

  bool hasMore;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserListResponse &&
    other.object == object &&
    _deepEquality.equals(other.data, data) &&
    other.firstId == firstId &&
    other.lastId == lastId &&
    other.hasMore == hasMore;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (data.hashCode) +
    (firstId.hashCode) +
    (lastId.hashCode) +
    (hasMore.hashCode);

  @override
  String toString() => 'UserListResponse[object=$object, data=$data, firstId=$firstId, lastId=$lastId, hasMore=$hasMore]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'data'] = this.data;
      json[r'first_id'] = this.firstId;
      json[r'last_id'] = this.lastId;
      json[r'has_more'] = this.hasMore;
    return json;
  }

  /// Returns a new [UserListResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserListResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserListResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserListResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserListResponse(
        object: UserListResponseObjectEnum.fromJson(json[r'object'])!,
        data: User.listFromJson(json[r'data']),
        firstId: mapValueOfType<String>(json, r'first_id')!,
        lastId: mapValueOfType<String>(json, r'last_id')!,
        hasMore: mapValueOfType<bool>(json, r'has_more')!,
      );
    }
    return null;
  }

  static List<UserListResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserListResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserListResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserListResponse> mapFromJson(dynamic json) {
    final map = <String, UserListResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserListResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserListResponse-objects as value to a dart map
  static Map<String, List<UserListResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserListResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserListResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'data',
    'first_id',
    'last_id',
    'has_more',
  };
}


class UserListResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UserListResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = UserListResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][UserListResponseObjectEnum].
  static const values = <UserListResponseObjectEnum>[
    list,
  ];

  static UserListResponseObjectEnum? fromJson(dynamic value) => UserListResponseObjectEnumTypeTransformer().decode(value);

  static List<UserListResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserListResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserListResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserListResponseObjectEnum] to String,
/// and [decode] dynamic data back to [UserListResponseObjectEnum].
class UserListResponseObjectEnumTypeTransformer {
  factory UserListResponseObjectEnumTypeTransformer() => _instance ??= const UserListResponseObjectEnumTypeTransformer._();

  const UserListResponseObjectEnumTypeTransformer._();

  String encode(UserListResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UserListResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserListResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return UserListResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UserListResponseObjectEnumTypeTransformer] instance.
  static UserListResponseObjectEnumTypeTransformer? _instance;
}


