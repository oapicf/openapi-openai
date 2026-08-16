//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VectorStoreExpirationAfter {
  /// Returns a new [VectorStoreExpirationAfter] instance.
  VectorStoreExpirationAfter({
    required this.anchor,
    required this.days,
  });

  /// Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
  VectorStoreExpirationAfterAnchorEnum anchor;

  /// The number of days after the anchor time that the vector store will expire.
  ///
  /// Minimum value: 1
  /// Maximum value: 365
  int days;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VectorStoreExpirationAfter &&
    other.anchor == anchor &&
    other.days == days;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (anchor.hashCode) +
    (days.hashCode);

  @override
  String toString() => 'VectorStoreExpirationAfter[anchor=$anchor, days=$days]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'anchor'] = this.anchor;
      json[r'days'] = this.days;
    return json;
  }

  /// Returns a new [VectorStoreExpirationAfter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VectorStoreExpirationAfter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "VectorStoreExpirationAfter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "VectorStoreExpirationAfter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return VectorStoreExpirationAfter(
        anchor: VectorStoreExpirationAfterAnchorEnum.fromJson(json[r'anchor'])!,
        days: mapValueOfType<int>(json, r'days')!,
      );
    }
    return null;
  }

  static List<VectorStoreExpirationAfter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreExpirationAfter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreExpirationAfter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VectorStoreExpirationAfter> mapFromJson(dynamic json) {
    final map = <String, VectorStoreExpirationAfter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VectorStoreExpirationAfter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VectorStoreExpirationAfter-objects as value to a dart map
  static Map<String, List<VectorStoreExpirationAfter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VectorStoreExpirationAfter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VectorStoreExpirationAfter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'anchor',
    'days',
  };
}

/// Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
class VectorStoreExpirationAfterAnchorEnum {
  /// Instantiate a new enum with the provided [value].
  const VectorStoreExpirationAfterAnchorEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const lastActiveAt = VectorStoreExpirationAfterAnchorEnum._(r'last_active_at');

  /// List of all possible values in this [enum][VectorStoreExpirationAfterAnchorEnum].
  static const values = <VectorStoreExpirationAfterAnchorEnum>[
    lastActiveAt,
  ];

  static VectorStoreExpirationAfterAnchorEnum? fromJson(dynamic value) => VectorStoreExpirationAfterAnchorEnumTypeTransformer().decode(value);

  static List<VectorStoreExpirationAfterAnchorEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreExpirationAfterAnchorEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreExpirationAfterAnchorEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreExpirationAfterAnchorEnum] to String,
/// and [decode] dynamic data back to [VectorStoreExpirationAfterAnchorEnum].
class VectorStoreExpirationAfterAnchorEnumTypeTransformer {
  factory VectorStoreExpirationAfterAnchorEnumTypeTransformer() => _instance ??= const VectorStoreExpirationAfterAnchorEnumTypeTransformer._();

  const VectorStoreExpirationAfterAnchorEnumTypeTransformer._();

  String encode(VectorStoreExpirationAfterAnchorEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a VectorStoreExpirationAfterAnchorEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreExpirationAfterAnchorEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'last_active_at': return VectorStoreExpirationAfterAnchorEnum.lastActiveAt;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [VectorStoreExpirationAfterAnchorEnumTypeTransformer] instance.
  static VectorStoreExpirationAfterAnchorEnumTypeTransformer? _instance;
}


