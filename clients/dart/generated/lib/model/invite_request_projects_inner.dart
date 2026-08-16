//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteRequestProjectsInner {
  /// Returns a new [InviteRequestProjectsInner] instance.
  InviteRequestProjectsInner({
    required this.id,
    required this.role,
  });

  /// Project's public ID
  String id;

  /// Project membership role
  InviteRequestProjectsInnerRoleEnum role;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteRequestProjectsInner &&
    other.id == id &&
    other.role == role;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (role.hashCode);

  @override
  String toString() => 'InviteRequestProjectsInner[id=$id, role=$role]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'role'] = this.role;
    return json;
  }

  /// Returns a new [InviteRequestProjectsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteRequestProjectsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteRequestProjectsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteRequestProjectsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteRequestProjectsInner(
        id: mapValueOfType<String>(json, r'id')!,
        role: InviteRequestProjectsInnerRoleEnum.fromJson(json[r'role'])!,
      );
    }
    return null;
  }

  static List<InviteRequestProjectsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteRequestProjectsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteRequestProjectsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteRequestProjectsInner> mapFromJson(dynamic json) {
    final map = <String, InviteRequestProjectsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteRequestProjectsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteRequestProjectsInner-objects as value to a dart map
  static Map<String, List<InviteRequestProjectsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteRequestProjectsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteRequestProjectsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'role',
  };
}

/// Project membership role
class InviteRequestProjectsInnerRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteRequestProjectsInnerRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const member = InviteRequestProjectsInnerRoleEnum._(r'member');
  static const owner = InviteRequestProjectsInnerRoleEnum._(r'owner');

  /// List of all possible values in this [enum][InviteRequestProjectsInnerRoleEnum].
  static const values = <InviteRequestProjectsInnerRoleEnum>[
    member,
    owner,
  ];

  static InviteRequestProjectsInnerRoleEnum? fromJson(dynamic value) => InviteRequestProjectsInnerRoleEnumTypeTransformer().decode(value);

  static List<InviteRequestProjectsInnerRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteRequestProjectsInnerRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteRequestProjectsInnerRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteRequestProjectsInnerRoleEnum] to String,
/// and [decode] dynamic data back to [InviteRequestProjectsInnerRoleEnum].
class InviteRequestProjectsInnerRoleEnumTypeTransformer {
  factory InviteRequestProjectsInnerRoleEnumTypeTransformer() => _instance ??= const InviteRequestProjectsInnerRoleEnumTypeTransformer._();

  const InviteRequestProjectsInnerRoleEnumTypeTransformer._();

  String encode(InviteRequestProjectsInnerRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteRequestProjectsInnerRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteRequestProjectsInnerRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'member': return InviteRequestProjectsInnerRoleEnum.member;
        case r'owner': return InviteRequestProjectsInnerRoleEnum.owner;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteRequestProjectsInnerRoleEnumTypeTransformer] instance.
  static InviteRequestProjectsInnerRoleEnumTypeTransformer? _instance;
}


