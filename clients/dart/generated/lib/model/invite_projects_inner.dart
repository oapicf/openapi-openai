//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteProjectsInner {
  /// Returns a new [InviteProjectsInner] instance.
  InviteProjectsInner({
    this.id,
    this.role,
  });

  /// Project's public ID
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Project membership role
  InviteProjectsInnerRoleEnum? role;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteProjectsInner &&
    other.id == id &&
    other.role == role;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (role == null ? 0 : role!.hashCode);

  @override
  String toString() => 'InviteProjectsInner[id=$id, role=$role]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.role != null) {
      json[r'role'] = this.role;
    } else {
      json[r'role'] = null;
    }
    return json;
  }

  /// Returns a new [InviteProjectsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteProjectsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteProjectsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteProjectsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteProjectsInner(
        id: mapValueOfType<String>(json, r'id'),
        role: InviteProjectsInnerRoleEnum.fromJson(json[r'role']),
      );
    }
    return null;
  }

  static List<InviteProjectsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteProjectsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteProjectsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteProjectsInner> mapFromJson(dynamic json) {
    final map = <String, InviteProjectsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteProjectsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteProjectsInner-objects as value to a dart map
  static Map<String, List<InviteProjectsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteProjectsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteProjectsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Project membership role
class InviteProjectsInnerRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteProjectsInnerRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const member = InviteProjectsInnerRoleEnum._(r'member');
  static const owner = InviteProjectsInnerRoleEnum._(r'owner');

  /// List of all possible values in this [enum][InviteProjectsInnerRoleEnum].
  static const values = <InviteProjectsInnerRoleEnum>[
    member,
    owner,
  ];

  static InviteProjectsInnerRoleEnum? fromJson(dynamic value) => InviteProjectsInnerRoleEnumTypeTransformer().decode(value);

  static List<InviteProjectsInnerRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteProjectsInnerRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteProjectsInnerRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteProjectsInnerRoleEnum] to String,
/// and [decode] dynamic data back to [InviteProjectsInnerRoleEnum].
class InviteProjectsInnerRoleEnumTypeTransformer {
  factory InviteProjectsInnerRoleEnumTypeTransformer() => _instance ??= const InviteProjectsInnerRoleEnumTypeTransformer._();

  const InviteProjectsInnerRoleEnumTypeTransformer._();

  String encode(InviteProjectsInnerRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteProjectsInnerRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteProjectsInnerRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'member': return InviteProjectsInnerRoleEnum.member;
        case r'owner': return InviteProjectsInnerRoleEnum.owner;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteProjectsInnerRoleEnumTypeTransformer] instance.
  static InviteProjectsInnerRoleEnumTypeTransformer? _instance;
}


