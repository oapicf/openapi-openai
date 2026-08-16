//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogActor {
  /// Returns a new [AuditLogActor] instance.
  AuditLogActor({
    this.type,
    this.session,
    this.apiKey,
  });

  /// The type of actor. Is either `session` or `api_key`.
  AuditLogActorTypeEnum? type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogActorSession? session;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AuditLogActorApiKey? apiKey;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogActor &&
    other.type == type &&
    other.session == session &&
    other.apiKey == apiKey;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (session == null ? 0 : session!.hashCode) +
    (apiKey == null ? 0 : apiKey!.hashCode);

  @override
  String toString() => 'AuditLogActor[type=$type, session=$session, apiKey=$apiKey]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.session != null) {
      json[r'session'] = this.session;
    } else {
      json[r'session'] = null;
    }
    if (this.apiKey != null) {
      json[r'api_key'] = this.apiKey;
    } else {
      json[r'api_key'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogActor] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogActor? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogActor[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogActor[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogActor(
        type: AuditLogActorTypeEnum.fromJson(json[r'type']),
        session: mapValueOfType<AuditLogActorSession>(json, r'session'),
        apiKey: mapValueOfType<AuditLogActorApiKey>(json, r'api_key'),
      );
    }
    return null;
  }

  static List<AuditLogActor> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogActor>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogActor.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogActor> mapFromJson(dynamic json) {
    final map = <String, AuditLogActor>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogActor.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogActor-objects as value to a dart map
  static Map<String, List<AuditLogActor>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogActor>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogActor.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of actor. Is either `session` or `api_key`.
class AuditLogActorTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AuditLogActorTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const session = AuditLogActorTypeEnum._(r'session');
  static const apiKey = AuditLogActorTypeEnum._(r'api_key');

  /// List of all possible values in this [enum][AuditLogActorTypeEnum].
  static const values = <AuditLogActorTypeEnum>[
    session,
    apiKey,
  ];

  static AuditLogActorTypeEnum? fromJson(dynamic value) => AuditLogActorTypeEnumTypeTransformer().decode(value);

  static List<AuditLogActorTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogActorTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogActorTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AuditLogActorTypeEnum] to String,
/// and [decode] dynamic data back to [AuditLogActorTypeEnum].
class AuditLogActorTypeEnumTypeTransformer {
  factory AuditLogActorTypeEnumTypeTransformer() => _instance ??= const AuditLogActorTypeEnumTypeTransformer._();

  const AuditLogActorTypeEnumTypeTransformer._();

  String encode(AuditLogActorTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AuditLogActorTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AuditLogActorTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'session': return AuditLogActorTypeEnum.session;
        case r'api_key': return AuditLogActorTypeEnum.apiKey;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AuditLogActorTypeEnumTypeTransformer] instance.
  static AuditLogActorTypeEnumTypeTransformer? _instance;
}


