//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ListAuditLogsResponse {
  /// Returns a new [ListAuditLogsResponse] instance.
  ListAuditLogsResponse({
    required this.object,
    this.data = const [],
    required this.firstId,
    required this.lastId,
    required this.hasMore,
  });

  ListAuditLogsResponseObjectEnum object;

  List<AuditLog> data;

  String firstId;

  String lastId;

  bool hasMore;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ListAuditLogsResponse &&
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
  String toString() => 'ListAuditLogsResponse[object=$object, data=$data, firstId=$firstId, lastId=$lastId, hasMore=$hasMore]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'data'] = this.data;
      json[r'first_id'] = this.firstId;
      json[r'last_id'] = this.lastId;
      json[r'has_more'] = this.hasMore;
    return json;
  }

  /// Returns a new [ListAuditLogsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ListAuditLogsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ListAuditLogsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ListAuditLogsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ListAuditLogsResponse(
        object: ListAuditLogsResponseObjectEnum.fromJson(json[r'object'])!,
        data: AuditLog.listFromJson(json[r'data']),
        firstId: mapValueOfType<String>(json, r'first_id')!,
        lastId: mapValueOfType<String>(json, r'last_id')!,
        hasMore: mapValueOfType<bool>(json, r'has_more')!,
      );
    }
    return null;
  }

  static List<ListAuditLogsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListAuditLogsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListAuditLogsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ListAuditLogsResponse> mapFromJson(dynamic json) {
    final map = <String, ListAuditLogsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ListAuditLogsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ListAuditLogsResponse-objects as value to a dart map
  static Map<String, List<ListAuditLogsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ListAuditLogsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ListAuditLogsResponse.listFromJson(entry.value, growable: growable,);
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


class ListAuditLogsResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ListAuditLogsResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = ListAuditLogsResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][ListAuditLogsResponseObjectEnum].
  static const values = <ListAuditLogsResponseObjectEnum>[
    list,
  ];

  static ListAuditLogsResponseObjectEnum? fromJson(dynamic value) => ListAuditLogsResponseObjectEnumTypeTransformer().decode(value);

  static List<ListAuditLogsResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListAuditLogsResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListAuditLogsResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ListAuditLogsResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ListAuditLogsResponseObjectEnum].
class ListAuditLogsResponseObjectEnumTypeTransformer {
  factory ListAuditLogsResponseObjectEnumTypeTransformer() => _instance ??= const ListAuditLogsResponseObjectEnumTypeTransformer._();

  const ListAuditLogsResponseObjectEnumTypeTransformer._();

  String encode(ListAuditLogsResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ListAuditLogsResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ListAuditLogsResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return ListAuditLogsResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ListAuditLogsResponseObjectEnumTypeTransformer] instance.
  static ListAuditLogsResponseObjectEnumTypeTransformer? _instance;
}


