//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteDeleteResponse {
  /// Returns a new [InviteDeleteResponse] instance.
  InviteDeleteResponse({
    required this.object,
    required this.id,
    required this.deleted,
  });

  /// The object type, which is always `organization.invite.deleted`
  InviteDeleteResponseObjectEnum object;

  String id;

  bool deleted;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteDeleteResponse &&
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
  String toString() => 'InviteDeleteResponse[object=$object, id=$id, deleted=$deleted]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
    return json;
  }

  /// Returns a new [InviteDeleteResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteDeleteResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteDeleteResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteDeleteResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteDeleteResponse(
        object: InviteDeleteResponseObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
      );
    }
    return null;
  }

  static List<InviteDeleteResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteDeleteResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteDeleteResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteDeleteResponse> mapFromJson(dynamic json) {
    final map = <String, InviteDeleteResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteDeleteResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteDeleteResponse-objects as value to a dart map
  static Map<String, List<InviteDeleteResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteDeleteResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteDeleteResponse.listFromJson(entry.value, growable: growable,);
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

/// The object type, which is always `organization.invite.deleted`
class InviteDeleteResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteDeleteResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodInvitePeriodDeleted = InviteDeleteResponseObjectEnum._(r'organization.invite.deleted');

  /// List of all possible values in this [enum][InviteDeleteResponseObjectEnum].
  static const values = <InviteDeleteResponseObjectEnum>[
    organizationPeriodInvitePeriodDeleted,
  ];

  static InviteDeleteResponseObjectEnum? fromJson(dynamic value) => InviteDeleteResponseObjectEnumTypeTransformer().decode(value);

  static List<InviteDeleteResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteDeleteResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteDeleteResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteDeleteResponseObjectEnum] to String,
/// and [decode] dynamic data back to [InviteDeleteResponseObjectEnum].
class InviteDeleteResponseObjectEnumTypeTransformer {
  factory InviteDeleteResponseObjectEnumTypeTransformer() => _instance ??= const InviteDeleteResponseObjectEnumTypeTransformer._();

  const InviteDeleteResponseObjectEnumTypeTransformer._();

  String encode(InviteDeleteResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteDeleteResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteDeleteResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.invite.deleted': return InviteDeleteResponseObjectEnum.organizationPeriodInvitePeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteDeleteResponseObjectEnumTypeTransformer] instance.
  static InviteDeleteResponseObjectEnumTypeTransformer? _instance;
}


