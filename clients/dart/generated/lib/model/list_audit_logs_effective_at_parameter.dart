//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ListAuditLogsEffectiveAtParameter {
  /// Returns a new [ListAuditLogsEffectiveAtParameter] instance.
  ListAuditLogsEffectiveAtParameter({
    this.gt,
    this.gte,
    this.lt,
    this.lte,
  });

  /// Return only events whose `effective_at` (Unix seconds) is greater than this value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? gt;

  /// Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? gte;

  /// Return only events whose `effective_at` (Unix seconds) is less than this value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lt;

  /// Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lte;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ListAuditLogsEffectiveAtParameter &&
    other.gt == gt &&
    other.gte == gte &&
    other.lt == lt &&
    other.lte == lte;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (gt == null ? 0 : gt!.hashCode) +
    (gte == null ? 0 : gte!.hashCode) +
    (lt == null ? 0 : lt!.hashCode) +
    (lte == null ? 0 : lte!.hashCode);

  @override
  String toString() => 'ListAuditLogsEffectiveAtParameter[gt=$gt, gte=$gte, lt=$lt, lte=$lte]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.gt != null) {
      json[r'gt'] = this.gt;
    } else {
      json[r'gt'] = null;
    }
    if (this.gte != null) {
      json[r'gte'] = this.gte;
    } else {
      json[r'gte'] = null;
    }
    if (this.lt != null) {
      json[r'lt'] = this.lt;
    } else {
      json[r'lt'] = null;
    }
    if (this.lte != null) {
      json[r'lte'] = this.lte;
    } else {
      json[r'lte'] = null;
    }
    return json;
  }

  /// Returns a new [ListAuditLogsEffectiveAtParameter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ListAuditLogsEffectiveAtParameter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ListAuditLogsEffectiveAtParameter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ListAuditLogsEffectiveAtParameter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ListAuditLogsEffectiveAtParameter(
        gt: mapValueOfType<int>(json, r'gt'),
        gte: mapValueOfType<int>(json, r'gte'),
        lt: mapValueOfType<int>(json, r'lt'),
        lte: mapValueOfType<int>(json, r'lte'),
      );
    }
    return null;
  }

  static List<ListAuditLogsEffectiveAtParameter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListAuditLogsEffectiveAtParameter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListAuditLogsEffectiveAtParameter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ListAuditLogsEffectiveAtParameter> mapFromJson(dynamic json) {
    final map = <String, ListAuditLogsEffectiveAtParameter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ListAuditLogsEffectiveAtParameter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ListAuditLogsEffectiveAtParameter-objects as value to a dart map
  static Map<String, List<ListAuditLogsEffectiveAtParameter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ListAuditLogsEffectiveAtParameter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ListAuditLogsEffectiveAtParameter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

