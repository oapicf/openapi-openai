//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageResponse {
  /// Returns a new [UsageResponse] instance.
  UsageResponse({
    required this.object,
    this.data = const [],
    required this.hasMore,
    required this.nextPage,
  });

  UsageResponseObjectEnum object;

  List<UsageTimeBucket> data;

  bool hasMore;

  String nextPage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageResponse &&
    other.object == object &&
    _deepEquality.equals(other.data, data) &&
    other.hasMore == hasMore &&
    other.nextPage == nextPage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (data.hashCode) +
    (hasMore.hashCode) +
    (nextPage.hashCode);

  @override
  String toString() => 'UsageResponse[object=$object, data=$data, hasMore=$hasMore, nextPage=$nextPage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'data'] = this.data;
      json[r'has_more'] = this.hasMore;
      json[r'next_page'] = this.nextPage;
    return json;
  }

  /// Returns a new [UsageResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UsageResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UsageResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UsageResponse(
        object: UsageResponseObjectEnum.fromJson(json[r'object'])!,
        data: UsageTimeBucket.listFromJson(json[r'data']),
        hasMore: mapValueOfType<bool>(json, r'has_more')!,
        nextPage: mapValueOfType<String>(json, r'next_page')!,
      );
    }
    return null;
  }

  static List<UsageResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageResponse> mapFromJson(dynamic json) {
    final map = <String, UsageResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageResponse-objects as value to a dart map
  static Map<String, List<UsageResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'data',
    'has_more',
    'next_page',
  };
}


class UsageResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UsageResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const page = UsageResponseObjectEnum._(r'page');

  /// List of all possible values in this [enum][UsageResponseObjectEnum].
  static const values = <UsageResponseObjectEnum>[
    page,
  ];

  static UsageResponseObjectEnum? fromJson(dynamic value) => UsageResponseObjectEnumTypeTransformer().decode(value);

  static List<UsageResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageResponseObjectEnum] to String,
/// and [decode] dynamic data back to [UsageResponseObjectEnum].
class UsageResponseObjectEnumTypeTransformer {
  factory UsageResponseObjectEnumTypeTransformer() => _instance ??= const UsageResponseObjectEnumTypeTransformer._();

  const UsageResponseObjectEnumTypeTransformer._();

  String encode(UsageResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UsageResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'page': return UsageResponseObjectEnum.page;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UsageResponseObjectEnumTypeTransformer] instance.
  static UsageResponseObjectEnumTypeTransformer? _instance;
}


