from datadog import initialize, api

options = {
    'api_key': '<YOUR_API_KEY>',
    'app_key': '<YOUR_APP_KEY>'
}

slo_id = '<YOUR_SLO_ID>'

initialize(**options)

api.ServiceLevelObjective.delete(slo_id)