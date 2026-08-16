//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteRequest {
  /// Returns a new [InviteRequest] instance.
  InviteRequest({
    required this.email,
    required this.role,
    this.projects = const [],
  });

  /// Send an email to this address
  String email;

  /// `owner` or `reader`
  InviteRequestRoleEnum role;

  /// An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
  List<InviteRequestProjectsInner> projects;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteRequest &&
    other.email == email &&
    other.role == role &&
    _deepEquality.equals(other.projects, projects);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (email.hashCode) +
    (role.hashCode) +
    (projects.hashCode);

  @override
  String toString() => 'InviteRequest[email=$email, role=$role, projects=$projects]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'email'] = this.email;
      json[r'role'] = this.role;
      json[r'projects'] = this.projects;
    return json;
  }

  /// Returns a new [InviteRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteRequest(
        email: mapValueOfType<String>(json, r'email')!,
        role: InviteRequestRoleEnum.fromJson(json[r'role'])!,
        projects: InviteRequestProjectsInner.listFromJson(json[r'projects']),
      );
    }
    return null;
  }

  static List<InviteRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteRequest> mapFromJson(dynamic json) {
    final map = <String, InviteRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteRequest-objects as value to a dart map
  static Map<String, List<InviteRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'email',
    'role',
  };
}

/// `owner` or `reader`
class InviteRequestRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteRequestRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const reader = InviteRequestRoleEnum._(r'reader');
  static const owner = InviteRequestRoleEnum._(r'owner');

  /// List of all possible values in this [enum][InviteRequestRoleEnum].
  static const values = <InviteRequestRoleEnum>[
    reader,
    owner,
  ];

  static InviteRequestRoleEnum? fromJson(dynamic value) => InviteRequestRoleEnumTypeTransformer().decode(value);

  static List<InviteRequestRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteRequestRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteRequestRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteRequestRoleEnum] to String,
/// and [decode] dynamic data back to [InviteRequestRoleEnum].
class InviteRequestRoleEnumTypeTransformer {
  factory InviteRequestRoleEnumTypeTransformer() => _instance ??= const InviteRequestRoleEnumTypeTransformer._();

  const InviteRequestRoleEnumTypeTransformer._();

  String encode(InviteRequestRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteRequestRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteRequestRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'reader': return InviteRequestRoleEnum.reader;
        case r'owner': return InviteRequestRoleEnum.owner;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteRequestRoleEnumTypeTransformer] instance.
  static InviteRequestRoleEnumTypeTransformer? _instance;
}


