//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Invite {
  /// Returns a new [Invite] instance.
  Invite({
    required this.object,
    required this.id,
    required this.email,
    required this.role,
    required this.status,
    required this.invitedAt,
    required this.expiresAt,
    this.acceptedAt,
    this.projects = const [],
  });

  /// The object type, which is always `organization.invite`
  InviteObjectEnum object;

  /// The identifier, which can be referenced in API endpoints
  String id;

  /// The email address of the individual to whom the invite was sent
  String email;

  /// `owner` or `reader`
  InviteRoleEnum role;

  /// `accepted`,`expired`, or `pending`
  InviteStatusEnum status;

  /// The Unix timestamp (in seconds) of when the invite was sent.
  int invitedAt;

  /// The Unix timestamp (in seconds) of when the invite expires.
  int expiresAt;

  /// The Unix timestamp (in seconds) of when the invite was accepted.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? acceptedAt;

  /// The projects that were granted membership upon acceptance of the invite.
  List<InviteProjectsInner> projects;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Invite &&
    other.object == object &&
    other.id == id &&
    other.email == email &&
    other.role == role &&
    other.status == status &&
    other.invitedAt == invitedAt &&
    other.expiresAt == expiresAt &&
    other.acceptedAt == acceptedAt &&
    _deepEquality.equals(other.projects, projects);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (email.hashCode) +
    (role.hashCode) +
    (status.hashCode) +
    (invitedAt.hashCode) +
    (expiresAt.hashCode) +
    (acceptedAt == null ? 0 : acceptedAt!.hashCode) +
    (projects.hashCode);

  @override
  String toString() => 'Invite[object=$object, id=$id, email=$email, role=$role, status=$status, invitedAt=$invitedAt, expiresAt=$expiresAt, acceptedAt=$acceptedAt, projects=$projects]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'email'] = this.email;
      json[r'role'] = this.role;
      json[r'status'] = this.status;
      json[r'invited_at'] = this.invitedAt;
      json[r'expires_at'] = this.expiresAt;
    if (this.acceptedAt != null) {
      json[r'accepted_at'] = this.acceptedAt;
    } else {
      json[r'accepted_at'] = null;
    }
      json[r'projects'] = this.projects;
    return json;
  }

  /// Returns a new [Invite] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Invite? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Invite[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Invite[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Invite(
        object: InviteObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        email: mapValueOfType<String>(json, r'email')!,
        role: InviteRoleEnum.fromJson(json[r'role'])!,
        status: InviteStatusEnum.fromJson(json[r'status'])!,
        invitedAt: mapValueOfType<int>(json, r'invited_at')!,
        expiresAt: mapValueOfType<int>(json, r'expires_at')!,
        acceptedAt: mapValueOfType<int>(json, r'accepted_at'),
        projects: InviteProjectsInner.listFromJson(json[r'projects']),
      );
    }
    return null;
  }

  static List<Invite> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Invite>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Invite.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Invite> mapFromJson(dynamic json) {
    final map = <String, Invite>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Invite.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Invite-objects as value to a dart map
  static Map<String, List<Invite>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Invite>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Invite.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'email',
    'role',
    'status',
    'invited_at',
    'expires_at',
  };
}

/// The object type, which is always `organization.invite`
class InviteObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodInvite = InviteObjectEnum._(r'organization.invite');

  /// List of all possible values in this [enum][InviteObjectEnum].
  static const values = <InviteObjectEnum>[
    organizationPeriodInvite,
  ];

  static InviteObjectEnum? fromJson(dynamic value) => InviteObjectEnumTypeTransformer().decode(value);

  static List<InviteObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteObjectEnum] to String,
/// and [decode] dynamic data back to [InviteObjectEnum].
class InviteObjectEnumTypeTransformer {
  factory InviteObjectEnumTypeTransformer() => _instance ??= const InviteObjectEnumTypeTransformer._();

  const InviteObjectEnumTypeTransformer._();

  String encode(InviteObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.invite': return InviteObjectEnum.organizationPeriodInvite;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteObjectEnumTypeTransformer] instance.
  static InviteObjectEnumTypeTransformer? _instance;
}


/// `owner` or `reader`
class InviteRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const owner = InviteRoleEnum._(r'owner');
  static const reader = InviteRoleEnum._(r'reader');

  /// List of all possible values in this [enum][InviteRoleEnum].
  static const values = <InviteRoleEnum>[
    owner,
    reader,
  ];

  static InviteRoleEnum? fromJson(dynamic value) => InviteRoleEnumTypeTransformer().decode(value);

  static List<InviteRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteRoleEnum] to String,
/// and [decode] dynamic data back to [InviteRoleEnum].
class InviteRoleEnumTypeTransformer {
  factory InviteRoleEnumTypeTransformer() => _instance ??= const InviteRoleEnumTypeTransformer._();

  const InviteRoleEnumTypeTransformer._();

  String encode(InviteRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'owner': return InviteRoleEnum.owner;
        case r'reader': return InviteRoleEnum.reader;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteRoleEnumTypeTransformer] instance.
  static InviteRoleEnumTypeTransformer? _instance;
}


/// `accepted`,`expired`, or `pending`
class InviteStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const accepted = InviteStatusEnum._(r'accepted');
  static const expired = InviteStatusEnum._(r'expired');
  static const pending = InviteStatusEnum._(r'pending');

  /// List of all possible values in this [enum][InviteStatusEnum].
  static const values = <InviteStatusEnum>[
    accepted,
    expired,
    pending,
  ];

  static InviteStatusEnum? fromJson(dynamic value) => InviteStatusEnumTypeTransformer().decode(value);

  static List<InviteStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteStatusEnum] to String,
/// and [decode] dynamic data back to [InviteStatusEnum].
class InviteStatusEnumTypeTransformer {
  factory InviteStatusEnumTypeTransformer() => _instance ??= const InviteStatusEnumTypeTransformer._();

  const InviteStatusEnumTypeTransformer._();

  String encode(InviteStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'accepted': return InviteStatusEnum.accepted;
        case r'expired': return InviteStatusEnum.expired;
        case r'pending': return InviteStatusEnum.pending;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteStatusEnumTypeTransformer] instance.
  static InviteStatusEnumTypeTransformer? _instance;
}


