//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogActorApiKey {
  /// Returns a new [AuditLogActorApiKey] instance.
  AuditLogActorApiKey({
    this.id,
    this.type,
    this.user,
    this.serviceAccount,
  });

  /// The tracking id of the API key.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The type of API key. Can be either `user` or `service_account`.
  AuditLogActorApiKeyTypeEnum? type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogActorUser? user;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogActorServiceAccount? serviceAccount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogActorApiKey &&
    other.id == id &&
    other.type == type &&
    other.user == user &&
    other.serviceAccount == serviceAccount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (user == null ? 0 : user!.hashCode) +
    (serviceAccount == null ? 0 : serviceAccount!.hashCode);

  @override
  String toString() => 'AuditLogActorApiKey[id=$id, type=$type, user=$user, serviceAccount=$serviceAccount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.user != null) {
      json[r'user'] = this.user;
    } else {
      json[r'user'] = null;
    }
    if (this.serviceAccount != null) {
      json[r'service_account'] = this.serviceAccount;
    } else {
      json[r'service_account'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogActorApiKey] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogActorApiKey? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogActorApiKey[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogActorApiKey[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogActorApiKey(
        id: mapValueOfType<String>(json, r'id'),
        type: AuditLogActorApiKeyTypeEnum.fromJson(json[r'type']),
        user: AuditLogActorUser.fromJson(json[r'user']),
        serviceAccount: AuditLogActorServiceAccount.fromJson(json[r'service_account']),
      );
    }
    return null;
  }

  static List<AuditLogActorApiKey> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogActorApiKey>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogActorApiKey.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogActorApiKey> mapFromJson(dynamic json) {
    final map = <String, AuditLogActorApiKey>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogActorApiKey.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogActorApiKey-objects as value to a dart map
  static Map<String, List<AuditLogActorApiKey>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogActorApiKey>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogActorApiKey.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of API key. Can be either `user` or `service_account`.
class AuditLogActorApiKeyTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AuditLogActorApiKeyTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const user = AuditLogActorApiKeyTypeEnum._(r'user');
  static const serviceAccount = AuditLogActorApiKeyTypeEnum._(r'service_account');

  /// List of all possible values in this [enum][AuditLogActorApiKeyTypeEnum].
  static const values = <AuditLogActorApiKeyTypeEnum>[
    user,
    serviceAccount,
  ];

  static AuditLogActorApiKeyTypeEnum? fromJson(dynamic value) => AuditLogActorApiKeyTypeEnumTypeTransformer().decode(value);

  static List<AuditLogActorApiKeyTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogActorApiKeyTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogActorApiKeyTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AuditLogActorApiKeyTypeEnum] to String,
/// and [decode] dynamic data back to [AuditLogActorApiKeyTypeEnum].
class AuditLogActorApiKeyTypeEnumTypeTransformer {
  factory AuditLogActorApiKeyTypeEnumTypeTransformer() => _instance ??= const AuditLogActorApiKeyTypeEnumTypeTransformer._();

  const AuditLogActorApiKeyTypeEnumTypeTransformer._();

  String encode(AuditLogActorApiKeyTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AuditLogActorApiKeyTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AuditLogActorApiKeyTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'user': return AuditLogActorApiKeyTypeEnum.user;
        case r'service_account': return AuditLogActorApiKeyTypeEnum.serviceAccount;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AuditLogActorApiKeyTypeEnumTypeTransformer] instance.
  static AuditLogActorApiKeyTypeEnumTypeTransformer? _instance;
}


